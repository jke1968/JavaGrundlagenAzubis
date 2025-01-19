package de.lbbw;

public class KlassenUndObjekteMain {

	public static void main(String[] args) {
		// Definiere eine Variable vom Typ "Konto"
		Konto konto1;
		// Erzeuge ein Objekt der Klasse "Konto"
		// und weise es der Variablen konto1 zu
		// -> verwende den default-Konstruktor
		konto1 = new Konto();
		// erzeuge ein zweites Konto-Objekt
		// Objekt = Instanz
		// "instanziiere ein Objekt der Klasse Konto"
		// -> verwende den 2-argument Konstruktor
		Konto konto2 = new Konto(101,0.50f);
		
		// setze die Nummern und Salden für 
		// beide Konto-Objekte
		konto1.setNr(100);
		// direkter Zugriff auf saldo wird vom Compiler(!)
		// verhindert
		// konto1.saldo = 5;
		konto1.einzahlen(5);
		System.out.println("nr: "+konto1.getNr()+" saldo: "+konto1.getSaldo());
		System.out.println("nr: "+konto2.getNr()+" saldo: "+konto2.getSaldo());
		// zahle 10000 vom konto mit der Nr 100 aus:
		konto1.auszahlen(10000);
		System.out.println("nr: "+konto1.getNr()+" saldo: "+konto1.getSaldo());
		// Definiere ein Array für 100 Objekte vom Typ Konto
		Konto[] konten = new Konto[100];
		// speichere das erste Konto-Objekt an der Stelle 0 im Array
		konten[0] = konto1;
		konten[1] = konto2;
		System.out.println("Alle Konten im Array: ");
		for (int i = 0; i < konten.length; i++) {
			if(konten[i]!=null) {
				System.out.println("Nr: "+konten[i].getNr()+" Saldo: "+konten[i].getSaldo());
			} else {
				System.out.println("Stelle "+i+" im Array ist nicht belegt");
			}
		}

	}

}
