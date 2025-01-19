package de.lbbw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class Filezugriff {

	/**
	 * schreibt ein UTF-8 codiertes Textfile
	 */
	public static void writeCSVFile() {
		String zeile = "spälte1;spölte2;spülte3";
		System.out.println("Versuche, Datei zu schreiben");
		// "try with resources" 
		// -> am Ende des try..catch Blocks wird automatisch writer.close() aufgerufen
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.csv",Charset.forName("UTF-8")))){
			// schreibe 3 Zeilen in die Datei:
			for (int i = 0; i < 3; i++) {
				writer.write(zeile);
				writer.newLine();
			}
			System.out.println("Datei geschrieben");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * liest ein UTF-8 codiertes Textfile
	 */
	public static int readCSVFile() {
		String zeile = "";
		System.out.println("Versuche, von Datei zu lesen");
		try (BufferedReader reader = new BufferedReader(new FileReader("output1.csv",Charset.forName("UTF-8")))) {
			// lese alle Zeilen bis zum Ende der Datei:
			while( (zeile=reader.readLine())!=null ) {
				System.out.println("Gelesen: "+zeile);
				// Zerlege die Zeile in Spalten, verwende als Trennzeichen
				// das Semikolon ";"
				// -> verwende dazu die split-Methode der Klasse String
				String[] spalten = zeile.split(";");
				System.out.println("Spalten: ");
				for (int i = 0; i < spalten.length; i++) {
					System.out.println("    "+spalten[i]);
				}
			}
			System.out.println("Datei vollständig gelesen");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// der Stack-Trace sollte in ein log-File geschrieben
			// e.printStackTrace();
			System.out.println("Fehler: Datei konnte nicht geoeffnet werden");
			return 1;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 1;
		}
		return 0;
	}
	public static void main(String[] args) {
		System.out.println("Enter main");
		writeCSVFile();
		if (readCSVFile()!=0) {
			System.out.println("Fehler beim Lesen der Datei");
		}
		System.out.println("Exit main");
	}

}
