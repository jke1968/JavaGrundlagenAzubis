package de.lbbw;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uebung05 {

	public static Scanner scanner = new Scanner(System.in);
	public static int anzahlNoten = 0;
	// final heisst: diese Variable darf nicht mehr modifiziert werden
	public static final int MAXNOTEN = 10;
	/**
	 * Liest nacheinander Noten von der Konsole und schreibt sie 
	 * in das übergebene Array
	 */
	public static void notenEingeben(int[] noten) {
		String input = "";
		do {
			if (anzahlNoten < MAXNOTEN) {
				System.out.println("Bitte Note eingeben (Beenden mit 'X': ");
				input = scanner.nextLine();
				if (!input.equals("X")) {
					noten[anzahlNoten] = Integer.parseInt(input);
					anzahlNoten = anzahlNoten + 1;
				}
			} else {
				System.out.println("Kein Speicherplatz mehr frei für die Noteneingabe");
			}
		} while (!input.equals("X"));
	}
	/**
	 * Gibt alle Noten im Array auf die Konsole aus
	 * @param noten
	 */
	public static void alleNotenAusgeben(int[] noten) {
		System.out.println("Alle Noten");
		System.out.println("==========");
		for (int i = 0; i < anzahlNoten; i++) {
			System.out.println(noten[i]);
		}
		System.out.println("==========");
	}
	/**
	 * Gibt den Durchschnitt aller Noten im übergebenen Array zurück
	 * @param noten
	 * @return
	 */
	public static float durchschnittBerechnen(int[] noten) {
		float result = 0.0f;
		if (anzahlNoten == 0) {
			System.out.println("Warnung: es wurden noch keine Noten eingegeben");
		} else {
			for (int i = 0; i < anzahlNoten; i++) {
				result = result + noten[i];
			}
			result = result / anzahlNoten;
		}
		return result;
	}
	/**
	 * Einstiegspunkt und Hauptmenü 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] noten = new int[MAXNOTEN];
		String input = "";
		do {
			System.out.println("Was wollen Sie tun?");
			System.out.println("1 - Noten eingeben");
			System.out.println("2 - Alle Noten ausgeben");
			System.out.println("3 - Notendurchschnitt berechnen");
			System.out.println("4 - Programm beenden");
			input = scanner.nextLine();
			switch (input) {
			case "1":
				notenEingeben(noten);
				break;
			case "2":
				alleNotenAusgeben(noten);
				break;
			case "3":
				float durchschnitt = durchschnittBerechnen(noten);
				// Runde auf 2 Nachkommastellen
				DecimalFormat df = new DecimalFormat("#.##");
				// Runde immer zum nächsten Nachbarn, d.h. 1.5 -> 2 und -1.5 -> -2
				df.setRoundingMode(RoundingMode.HALF_UP);
				System.out.print("Notendurchschnitt für ");
				System.out.println(anzahlNoten + " Noten: " + df.format(durchschnitt));
				break;
			case "4":
				System.out.println("Auf Wiedersehen");
				break;
			default:
				System.out.println("Ungueltige Option");
				break;
			}
		} while (!input.equals("4"));
		scanner.close();
	}

}
