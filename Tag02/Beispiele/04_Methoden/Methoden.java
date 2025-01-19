package de.lbbw;

import java.util.Scanner;

//if(input.equals("1")) {
//	// addieren
//} else if (input.equals("2")) {
//	// subtrahieren
//} else if (input.equals("3")) {
//	System.out.println("Programm wird beendet");
//} else {
//	System.out.println("Unbekannte Option: "+input);
//}

public class Methoden {
	// globale Variable, die für alle Methoden dieser Klasse sichtbar ist
	public static Scanner scanner = new Scanner(System.in);

	// definiere die Methode inputZahl
	// -> diese Methode akzeptiert keine Parameter (-> () )
	// und gibt einen Wert vom Typ int zurück
	public static int inputZahl() {
		// diese Variablen sind nicht global, sondern lokal zur Methode addiere
		// d.h. sie sind nur sichtbar für diese Methodes
		int zahl = 0;
		System.out.println("Bitte Zahl eingeben: ");
		// die Methode Integer.parseInt wandelt einen String in einen Integer-Wert
		zahl = Integer.parseInt(scanner.nextLine());
		// gib den Wert der Variable zahl an den Aufrufer zurück
		return zahl;
	}
	// definiere eine Methode namens addiere
	// -> diese Methode akzeptiert 2 Parameter vom Typ int 
	// und gibt einen Wert vom Typ int zurück
	public static int addiere(int zahl1, int zahl2) {
		int ergebnis = 0;
		ergebnis = zahl1 + zahl2;
		return ergebnis;
	}
	public static int subtrahiere(int zahl1, int zahl2) {
		int ergebnis = 0;
		ergebnis = zahl1 - zahl2;
		return ergebnis;
	}
	public static void controlLogic(String input) {
		int zahl1 = 0;
		int zahl2 = 0;
		int ergebnis = 0;

		// verwende switch..case anstelle von if...else if
		switch(input) {
		case "1":
			// lese zwei int Zahlen von der Konsole
			zahl1 = inputZahl();
			zahl2 = inputZahl();
			// rufe die Methode addiere auf
			// übergebe dabei die Parameter zahl1 und zahl2
			ergebnis = addiere(zahl1,zahl2);
			System.out.println("Ergebnis= "+ergebnis);
			break;
		case "2":
			zahl1 = inputZahl();
			zahl2 = inputZahl();
			ergebnis = subtrahiere(zahl1,zahl2);
			System.out.println("Ergebnis= "+ergebnis);

			break;
		case "3":
			System.out.println("Programm wird beendet");
			break;
		default:
			System.out.println("Unbekannte Option: "+input);
			break;
		}

	}
	public static void printMenu() {
		String input = "";
		// Wiederhole, solange input NICHT (-> !) GLEICH 3 ist
		while(!input.equals("3")) {
			System.out.println("Was wollen Sie tun?");
			System.out.println("1 - Addieren");
			System.out.println("2 - Subtrahieren");
			System.out.println("3 - Programm beenden");
			input = scanner.nextLine();
			controlLogic(input);
		} // zurück zum Schleifenanfang
		scanner.close();

	}
	public static void main(String[] args) {
		System.out.println("Programmstart");
		printMenu();
		System.out.println("Programmende");
	}

}
