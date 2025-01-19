package de.lbbw;

public class Kreis {
	// statisches Attribut
	private static int anzahlObjekte;
	
	private int radius;
    // 2-fach überladener Konstruktor
	public Kreis() {
		this.radius = 1;
		anzahlObjekte++;
	}
	public Kreis(int radius) {
		this.radius = radius;
		anzahlObjekte++;
	}
	public int getRadius() {
		return radius;
	}
	// diese Methoden sind keine statischen Methoden
	// sondern sog. Instanzmethoden oder Objektmethoden
	public double berechneUmfang() {
		return 2*Math.PI*radius;
	}
	public double berechneFlaeche() {
		return Math.PI*radius*radius;
	}
	// statische Methode zum Zugriff auf privates statisches Attribut
	public static int getAnzahlObjekte() {
		return anzahlObjekte;
	}

}
