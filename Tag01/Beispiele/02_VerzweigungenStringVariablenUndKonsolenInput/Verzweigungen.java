package de.lbbw;

// Zeige dem Compiler den Pfad zur Klasse "Scanner"
// aus der JRE System Library
import java.util.Scanner;

public class Verzweigungen {
	public static void main(String[] args) {
		// Definition und Initialisierung der Variablen namens "passwort" vom Typ String
		// das Zeichen "=" ist hier der sog. Zuweisungsoperator und kopiert
		// die rechte Seite in die linke Seite
		// Variablen vom Typ String können beliebig viele beliebige Zeichen beinhalten
		String passwort = "ABC123";
		String eingabe = "";
		System.out.print("Bitte Passwort eingeben: ");
		// Benutze eine Variable vom Typ Scanner um Strings von der Konsole zu lesen:
		Scanner scanner = new Scanner(System.in);
		// lese von der Konsole und speichere die Eingabe in der Variablen "eingabe"
		eingabe = scanner.next();
		// prüfe, ob der Inhalt der Stringvariablen "eingabe"
		// gleich dem Inhalt der Stringvariablen "passwort" ist
		if(eingabe.equals(passwort)) {
			System.out.println("Sie sind angemeldet");
		} else {
			System.out.println("Falsches Passwort");
		}
	}
}