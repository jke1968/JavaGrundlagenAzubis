package de.lbbw;

import java.util.Scanner;

public class Schleifen {

	public static void main(String[] args) {
		System.out.println("Enter main");
		// Schleife, die die Zahlen zwischen 0 und 10 ausgibt
		// Definiere zunächst eine Zählvariable vom Typ int (= ganze Zahl)
		// und initialisiere sie mit dem Wert 0
		int zaehler = 0;
		// wenn die Bedingung erfüllt ist, wird in den scope verzweigt
		// ansonsten hinter den scope
		while(zaehler <= 10) { // Beginn des scopes der Schleife 
			// Ergänze den in einen String konvertierten Wert von "zaehler"
			// um ein Leerzeichen (" ")
			System.out.print(zaehler+" ");
			// erhöhe den Wert der Variablen "zaehler" um 1
			zaehler = zaehler + 1;
		} // Ende des scopes der while -> hier erfolgt ein Rüclsprung zum while
		System.out.println();
		String input = "";
		System.out.println("Bitte beliebigen String eingeben");
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextLine();
		int laengeDesStrings = input.length();
		System.out.println("Der String \""+input+"\" hat die Laenge "+laengeDesStrings);
		scanner.close();
		System.out.println("Exit main");
	}
}
