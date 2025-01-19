package de.lbbw;

// abstrakte können nicht instanziiert werden
public abstract class Konto {
	private int nr;
	private float saldo;
	public Konto() {
		this.nr = -1;
		this.saldo = 0;
	}
	public Konto(int nr, float saldo) {
		this.nr = nr;
		this.saldo = saldo;
	}
	public void einzahlen(float betrag) {
		saldo = saldo + betrag;
	}
	public void auszahlen(float betrag) {
		saldo = saldo - betrag;
	}
	public void setNr(int nr) {
		this.nr = nr;
	}
	public int getNr() {
		return nr;
	}
	public float getSaldo() {
		return saldo;
	}
}
