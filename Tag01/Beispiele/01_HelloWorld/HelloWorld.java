// Diese Klasse gehört zum Package de.lbbw
// d.h. 
// 1. das File dieser Klasse liegt im Ordner de/lbbw
// 2. die Klasse HelloWorld heisst voll qualifiziert de.lbbw.HelloWorld
package de.lbbw;

// Definition der Klasse "HelloWorld"
// -> vorläufig nur ein 'Behälter' für Methoden
// public bedeutet: für alle anderen Klassen des Programms sichtbar
public class HelloWorld { // Beginn des scopes der Klasse

	// Definition der Methode main
	// -> darf pro Java-Programm nur einmal existieren
	// -> Einstiegspunkt für das Programm
	// public: siehe oben
	// static: zum Aufruf dieser Methode ist kein Objekt nötig
	// void:   diese Methode hat keinen Rückgabewert
	// 'main': der Name der Methode
	// (String[] args) : die sog. Parameterliste der Methode
	public static void main(String[] args) { // Beginn des scopes
		// Aufruf der Methode println der Klasse PrintStream
		// des Attributs out der Klasse java.lang.System
		// -> println schreibt ihr Argument "Hello World !" auf die Konsole
		// "Hello World !" ist eine sog. String-Konstante 
		// ein String ist eine Folge von beleibigen Zeichen
		System.out.println("Hello \\ \"World\" !");
	} // Ende des scopes

} // Ende des Scopes der Klasse
