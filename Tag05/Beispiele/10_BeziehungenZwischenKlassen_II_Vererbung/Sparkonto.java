package de.lbbw;

public class Sparkonto extends Konto {
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
	

}
