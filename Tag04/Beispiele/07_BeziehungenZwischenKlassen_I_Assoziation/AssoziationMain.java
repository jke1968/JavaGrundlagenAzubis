package de.lbbw;

public class AssoziationMain {

	public static void main(String[] args) {
		System.out.println("Enter main -> PROGRAMMSTART");
		Kunde kunde1 = new Kunde("Gosling","San Francisco");
		Kunde kunde2 = new Kunde("Hejlsberg","Seattle");
		Konto konto1 = new Konto(100,555.55f);
		Konto konto2 = new Konto(101,0f);
		Konto konto3 = new Konto(200,0.5f);
		Konto konto4 = new Konto(201,100f);
		// ordne die Konten-Objekte den Kunden-Objekten zu
		kunde1.addKonto(konto1);
		kunde1.addKonto(konto2);
		kunde2.addKonto(konto3);
		kunde1.addKonto(konto4);
		// gib die Zuordnungen aus:
		kunde1.printKonten();
		kunde2.printKonten();
		System.out.println("Exit main -> PROGRAMMENDE");
	}

}
