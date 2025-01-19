package de.lbbw;

public class AbstrakteKlassenUndInterfacesMain {

	public static void main(String[] args) {
		// Abstrakte Klassen dienen nur
		// als "Behälter" für gemeinsam genutzten
		// Code und als gemeinsamer Datentyp
		// -> sie können nicht instanziiert werden
		// Konto k = new Konto(100,999);
		Girokonto gk = new Girokonto(101,0,10000);
		Sparkonto sk = new Sparkonto(102,0,10000);
	}

}
