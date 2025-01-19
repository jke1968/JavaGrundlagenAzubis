package de.lbbw;

// Eine Klasse in Java kann nur Subklasse einer
// anderen Klasse sein, aber mehrere Interfaces
// implementieren
public class Sparkonto extends Konto implements Anlage {
	private int verfRahmen;

	public Sparkonto() {
		super();
		verfRahmen = 0;
	}

	public Sparkonto(int nr, float saldo, int verfRahmen) {
		super(nr, saldo);
		this.verfRahmen = verfRahmen;
	}

	public int getVerfRahmen() {
		return verfRahmen;
	}

	public void setVerfRahmen(int verfRahmen) {
		this.verfRahmen = verfRahmen;
	}

	@Override
	public int getNummer() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getWert() {
		// TODO Auto-generated method stub
		return getSaldo();
	}
	

}
