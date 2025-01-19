package de.lbbw;

public class NonFood extends Artikel {

	private int garantie;
	
	public NonFood(int nr, String name, double nettopreis, int garantie) {
		super(nr, name, nettopreis);
		this.garantie = garantie;
	}

	public int getGarantie() {
		return garantie;
	}

	@Override
	public String toString() {
		return super.toString()+";"+garantie+";"+this.getClass().getSimpleName();
	}

}
