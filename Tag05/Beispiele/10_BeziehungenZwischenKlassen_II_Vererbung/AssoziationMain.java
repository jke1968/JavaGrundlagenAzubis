package de.lbbw;

public class AssoziationMain {

	public static void main(String[] args) {
		System.out.println("Enter main -> PROGRAMMSTART");
		Kunde kunde = new Kunde("Gosling","San Francisco");
		Girokonto gk = new Girokonto(100, 999.99f, 10000);
		Sparkonto sk = new Sparkonto(101,0,5000);
		// Vererbung bedeutet:
		// Den Objekten der Subklassen stehen alle Methoden
		// und Attribute der Basisklasse zur Verfügung
		gk.einzahlen(5000);
		sk.auszahlen(1000);
		// Vererbung bedeutet ausserdem:
		// der Datentyp der Basisklasse wird an die Subklasse
		// vererbt: d.h. das Objekt "gk" hat sowohl den Typ
		// "Girokonto" als auch den Typ "Konto"
		kunde.addKonto(gk);
		kunde.addKonto(sk);
		kunde.printKonten();
		String s = "TEST";
		System.out.println("Exit main -> PROGRAMMENDE");
	}

}
