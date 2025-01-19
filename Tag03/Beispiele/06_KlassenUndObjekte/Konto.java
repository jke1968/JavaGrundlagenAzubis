package de.lbbw;

// Definiere einen eigenen 
// (benutzerdefinierten) Datentyp
// namens "Konto" = definiere eine Klasse
// namens "Konto"
public class Konto {
	// Attribute
	// private bedeutet:
	// nur innerhalb dieser Klasse sichtbar
	// Prinzip der "Datenkapselung"
	private int nr;
	private float saldo;
	// spezielle Methoden: Konstruktoren
	// Konstruktoren können nur mit dem new-Operator
	// aufgerufen werden-
	// default-Konstruktor: ohne Parameter
	public Konto() {
		this.nr = -1;
		this.saldo = 0;
	}
	// 2-Argument Konstruktor: 
	// mit 2 Argumenten/Parametern
	public Konto(int nr, float saldo) {
		this.nr = nr;
		this.saldo = saldo;
	}
	// Methoden
	// neu: diese Methoden sind nicht-statische Methoden
	// d.h. es sind Objekt-Methoden
	// d.h. es wird zunächst ein Objekt der Klasse benötigt
	// um sie aufzurufen
	public void einzahlen(float betrag) {
		// evtl. vorher Prüfungen durchführen
		saldo = saldo + betrag;
	}
	public void auszahlen(float betrag) {
		// evtl. vorher Prüfungen durchführen
		saldo = saldo - betrag;
	}
	public void setNr(int nr) {
		// schreibe den Wert des Parameters nr
		// in das Attribut this.nr
		// this bezieht sich immer auf das Objekt
		// für das eine Methode aufgerufen wurde
		this.nr = nr;
	}
	public int getNr() {
		return nr;
	}
	public float getSaldo() {
		return saldo;
	}
}
