package de.lbbw;

import java.math.RoundingMode;
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
		liste[anzahlArtikel]=a;
		anzahlArtikel++;
	}
	public void printArtikel(Artikel a) {
		// Formatierte Ausgabe der Artikelattribute
		// %d    -> int
		// %-10s -> String in einer 10-stelligen linksbündigen Spalte 
		// %5.2f -> Double mit insgesamt 5 Stellen, davon 2 Nachkommastellen 
		String output = String.format("%d %-10s %5.2f %5.2f", a.getNr(),a.getName(),a.getNettopreis(),a.berechneBruttopreis());
		System.out.println(output);
		// Alternative mit DecimalFormat: 
		// Formatiere den Bruttopreis auf 2 Nachkommastellen
		// DecimalFormat df = new DecimalFormat("#.##");
		// runde auf den nächsten Nachbarn: aus 1.5 wird 2 /  aus -1.5 wird -2
		// df.setRoundingMode(RoundingMode.HALF_UP);
		// String bruttopreis = df.format(a.berechneBruttopreis());
		// System.out.println(a.getNr()+" "+a.getName()+" "+a.getNettopreis()+" "+bruttopreis);
	}
	public void printAlleArtikel() {
		if(anzahlArtikel==0) {
			System.out.println("Es wurden noch keine Artikel erfasst");
		} else {
			System.out.println("Alle Artikel im Katalog");
			System.out.println("=======================");
			for (int i = 0; i < anzahlArtikel; i++) {
				printArtikel(liste[i]);
			}
		}
	}
}