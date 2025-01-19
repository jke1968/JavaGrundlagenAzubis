package de.lbbw;

public class Kunde {
	private String name;
	private String adresse;
	private Konto[] konten;
	private int kontenZaehler;
	private final int MAXKONTEN = 10;
	
	public Kunde(String name, String adresse) {
		this.name = name;
		this.adresse = adresse;
		// initialisiere das Array konten
		konten = new Konto[MAXKONTEN];
		kontenZaehler = 0;
	}

	public void addKonto(Konto konto) {
		if(kontenZaehler<MAXKONTEN) {
			konten[kontenZaehler] = konto;
			kontenZaehler++;
		} else {
			System.out.println("Konto konnte nicht hinzugefügt werden - Interner Speicher ist voll");
		}
	}
	
	public void printKonten() {
		System.out.println("Alle Konten des Kunden "+name);
		for (int i = 0; i < 23 + name.length(); i++) {
			System.out.print("=");
		}
		System.out.println();
		for (int i = 0; i < kontenZaehler; i++) {
			Konto k = konten[i];
			System.out.print("Nr: "+k.getNr()+" Saldo: "+k.getSaldo());
			// prüfe zur Laufzeit, ob k vom Typ "Girokonto" ist:
			if (k instanceof Girokonto) {
				// ((Girokonto)k) ist ein "cast" auf den Typ Girokonto
				System.out.println(" Dispo: "+((Girokonto)k).getDispo());
			}
			if (k instanceof Sparkonto) {
				System.out.println(" VerfRahmen: "+((Sparkonto)k).getVerfRahmen());
			}
		}
	}
}
