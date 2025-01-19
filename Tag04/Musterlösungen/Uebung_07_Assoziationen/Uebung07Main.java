package de.lbbw;

import java.util.Scanner;

public class Uebung07Main {

	public static Scanner scanner = new Scanner(System.in);
	
	public static void erfasseArtikel(Artikelkatalog katalog) {
		int nr = 0;
		String name = "";
		double nettopreis = 0;
		boolean eingabeKorrekt = false;
		do  {
			System.out.print("Nr: ");
			try {
				nr = Integer.parseInt(scanner.nextLine());
				eingabeKorrekt = true;
			} catch (Exception e) {
				System.out.println("Bitte nur ganze Zahlen eingeben: ");
			}
		} while (!eingabeKorrekt);
		System.out.print("Name: ");
		name = scanner.nextLine();
		System.out.print("Nettopreis: ");
		eingabeKorrekt=false;
		do {
			try {
				nettopreis = Double.parseDouble(scanner.nextLine());
				eingabeKorrekt = true;
			} catch(Exception e) {
				System.out.println("Bitte nur Zahlen eingeben");
			}
		} while(!eingabeKorrekt);
		Artikel artikel = new Artikel(nr, name, nettopreis);
		katalog.addArtikel(artikel);
	}
	
	public static void main(String[] args) {
		Artikelkatalog katalog = new Artikelkatalog();
		String eingabe = "";
		do {
			System.out.println("Was wollen Sie tun ?");
			System.out.println("1 - Einen Artikel erfassen");
			System.out.println("2 - Alle Artikel ausgeben");
			System.out.println("3 - Programm beenden");
			eingabe = scanner.nextLine();
			switch(eingabe) {
			case "1":
				erfasseArtikel(katalog);
				break;
			case "2":
				katalog.printAlleArtikel();
				break;
			case "3":
				System.out.println("ENDE");
				break;
			default:
				System.out.println("Falsche Eingabe!");
			}
		} while(eingabe!="3");
		scanner.close();
	}
}