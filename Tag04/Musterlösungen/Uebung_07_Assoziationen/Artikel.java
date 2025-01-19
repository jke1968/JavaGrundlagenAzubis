package de.lbbw;

public class Artikel {
	private int nr;
	private String name;
	private double nettopreis;
	public Artikel(int nr, String name, double nettopreis) {
		this.nr = nr;
		this.name = name;
		this.nettopreis = nettopreis;
	}
	public double berechneBruttopreis() {
		return 1.19 * nettopreis;
	}
	public int getNr() {
		return nr;
	}
	public String getName() {
		return name;
	}
	public double getNettopreis() {
		return nettopreis;
	}
}
