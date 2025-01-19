package de.lbbw;

public class Depot implements Anlage {
	private int nr;
	private int wert;
	public Depot(int nr, int wert) {
		super();
		this.nr = nr;
		this.wert = wert;
	}
	@Override
	public int getNummer() {
		// TODO Auto-generated method stub
		return nr;
	}
	@Override
	public float getWert() {
		// TODO Auto-generated method stub
		return wert;
	}
	
}
