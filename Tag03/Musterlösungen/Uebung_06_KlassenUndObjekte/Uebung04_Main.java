package de.lbbw;

import java.util.Scanner;

public class Uebung04_Main {
	
	public static void main(String[] args) {

		// Array erzeugen (noch keine Kreis-Objekte !)
		Kreis[] kreise = new Kreis[3];
		// rufe die statische Methode getAnzahlObjekte()
		System.out.println("Anzahl Objekte: "+Kreis.getAnzahlObjekte());

		// Kreis-Objekte erzeugen
		Kreis k1 = new Kreis();
		Kreis k2 = new Kreis(2);
		Kreis k3 = new Kreis(3);

		kreise[0] = new Kreis();
		kreise[1] = new Kreis(2);
		kreise[2] = new Kreis(3);
		double summeFlaeche=0;
		double summeUmfang=0;
		for(int index=0; index<kreise.length;index++) {
			Kreis k = kreise[index];
			// rufe die Instanzmethoden getRadius() und berechneFlaeche() und berechneUmfang()
			System.out.println(k.getRadius()+" "+k.berechneFlaeche()+" "+k.berechneUmfang());
			summeFlaeche = summeFlaeche + k.berechneFlaeche();
			summeUmfang = summeUmfang + k.berechneUmfang();
		}
		System.out.println("summeFlaeche: "+summeFlaeche+" "+"summeUmfang: "+summeUmfang);
		// rufe die statische Methode getAnzahlObjekte()
		System.out.println("Anzahl Objekte: "+Kreis.getAnzahlObjekte());
	}
}