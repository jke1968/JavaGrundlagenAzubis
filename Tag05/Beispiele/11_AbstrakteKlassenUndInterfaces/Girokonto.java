package de.lbbw;

// Girokonto ist Subklasse der Basisklasse Konto
public class Girokonto extends Konto {
	private int dispo;

	public Girokonto() {
		// rufe den default-Konstruktor der Basisklasse
		super(); 
		dispo = 0;
	}

	public Girokonto(int nr, float saldo, int dispo) {
		// rufe den 2-Argument-Konstruktor der Basisklasse
		super(nr, saldo);
		this.dispo = dispo;
	}

	public int getDispo() {
		return dispo;
	}

	public void setDispo(int dispo) {
		this.dispo = dispo;
	}
	
}
