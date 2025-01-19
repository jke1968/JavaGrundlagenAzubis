package de.lbbw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.charset.Charset;
import java.text.DecimalFormat;

public class Artikelkatalog {
	private Artikel[] liste;
	private final int MAXARTIKEL = 10;
	private int anzahlArtikel;

	public Artikelkatalog() {
		anzahlArtikel = 0;
		liste = new Artikel[MAXARTIKEL];
	}

	public void addArtikel(Artikel a) {
		liste[anzahlArtikel] = a;
		anzahlArtikel++;
	}

	public void printArtikel(Artikel a) {
		// Formatierte Ausgabe der Artikelattribute
		// %d -> int
		// %-10s -> String in einer 10-stelligen linksbündigen Spalte
		// %5.2f -> Double mit insgesamt 5 Stellen, davon 2 Nachkommastellen
		String output = String.format("%d %-15s %6.2f %6.2f", a.getNr(), a.getName(), a.getNettopreis(),
				a.berechneBruttopreis());
		switch(a) {
		case Food f:
			output += " "+f.getVerfallsDatum();
			break;
		case NonFood n:
			output += " "+n.getGarantie();
			break;
		default:
			System.out.println("Unknown type: "+a.getClass().getSimpleName());
			break;
		}
		System.out.println(output);
		// Alternative mit DecimalFormat:
		// Formatiere den Bruttopreis auf 2 Nachkommastellen
		// DecimalFormat df = new DecimalFormat("#.##");
		// runde auf den nächsten Nachbarn: aus 1.5 wird 2 / aus -1.5 wird -2
		// df.setRoundingMode(RoundingMode.HALF_UP);
		// String bruttopreis = df.format(a.berechneBruttopreis());
		// System.out.println(a.getNr()+" "+a.getName()+" "+a.getNettopreis()+"
		// "+bruttopreis);
	}

	public void printAlleArtikel() {
		if (anzahlArtikel == 0) {
			System.out.println("Es wurden noch keine Artikel erfasst");
		} else {
			System.out.println("Alle Artikel im Katalog");
			System.out.println("=======================");
			for (int i = 0; i < anzahlArtikel; i++) {
				printArtikel(liste[i]);
			}
		}
	}

	public void schreibeInDatei() {
		System.out.println("Versuche, Datei zu schreiben");
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("artikel.csv", Charset.forName("UTF-8")))) {
			for (int i = 0; i < anzahlArtikel; i++) {
				Artikel artikel = liste[i];
				writer.write(artikel.toString());
				writer.newLine();
			}
			System.out.println("Datei geschrieben");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void loescheListe() {
		for (int i = 0; i < liste.length; i++) {
			liste[i] = null;
		}
		anzahlArtikel = 0;
	}

	public void leseVonDatei() {
		String zeile = "";
		System.out.println("Versuche, von Datei zu lesen");
		try (BufferedReader reader = new BufferedReader(new FileReader("artikel.csv", Charset.forName("UTF-8")))) {
			loescheListe();
			int counter = 0;
			while ((zeile = reader.readLine()) != null) {
				String[] spalten = zeile.split(";");
				int nr = Integer.parseInt(spalten[0]);
				String name = spalten[1];
				double nettopreis = Double.parseDouble(spalten[2]);
				String specialAttribute = spalten[3];  
				String type = spalten[4];
				switch (type) {
				case "NonFood":
					addArtikel(new NonFood(nr, name, nettopreis,Integer.parseInt(specialAttribute)));
					break;
				case "Food":
					addArtikel(new Food(nr, name, nettopreis,specialAttribute));
					break;
				default:
					System.out.println("Unknown Artikel type: " + type);
					break;
				}
				counter++;
			}
			System.out.println(counter + " Artikel von Datei gelesen");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
