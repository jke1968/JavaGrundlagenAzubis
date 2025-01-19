package de.lbbw;

public class Food extends Artikel {
	private String verfallsDatum;

	public Food(int nr, String name, double nettopreis, String verfallsDatum) {
		super(nr, name, nettopreis);
		this.verfallsDatum = verfallsDatum;
	}

	public String getVerfallsDatum() {
		return verfallsDatum;
	}
	@Override
	public String toString() {
		return super.toString()+";"+verfallsDatum+";"+this.getClass().getSimpleName();
	}

}
