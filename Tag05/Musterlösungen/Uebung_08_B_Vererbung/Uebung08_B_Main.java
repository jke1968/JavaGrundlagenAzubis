package de.lbbw;

import java.util.Scanner;

public class Uebung08_B_Main {

	public static Scanner scanner = new Scanner(System.in);
	
	public static void erfasseArtikel(Artikelkatalog katalog) {
		int nr = 0;
		String name = "";
		double nettopreis = 0;
		String artikeltyp = "";
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
		System.out.println("(F)ood oder (N)onFood");
		artikeltyp = scanner.nextLine();
		Artikel artikel = null;
		String verfallsdatum = ""; 
		String garantie = ""; 
		switch(artikeltyp) {
		case "F":
			System.out.println("Verfallsdatum (TT-MM-JJJJ): ");
			verfallsdatum = scanner.nextLine();
			artikel = new Food(nr, name, nettopreis,verfallsdatum);
			break;
		case "N":
			System.out.println("Garantie (in Monaten): ");
			garantie = scanner.nextLine();
			artikel = new NonFood(nr, name, nettopreis,Integer.parseInt(garantie));
			break;
		default:
			System.out.println("Unbekannter Artikeltyp "+artikeltyp);
			break;
		}
		katalog.addArtikel(artikel);
	}
	
	public static void main(String[] args) {
		Artikelkatalog katalog = new Artikelkatalog();
		String eingabe = "";
		do {
			System.out.println("Was wollen Sie tun ?");
			System.out.println("1 - Einen Artikel erfassen");
			System.out.println("2 - Alle Artikel ausgeben");
			System.out.println("3 - Artikel in Datei speichern");
			System.out.println("4 - Artikel von Datei lesen");
			System.out.println("5 - Programm beenden");
			eingabe = scanner.nextLine();
			switch(eingabe) {
			case "1":
				erfasseArtikel(katalog);
				break;
			case "2":
				katalog.printAlleArtikel();
				break;
			case "3":
				katalog.schreibeInDatei();
				break;
			case "4":
				katalog.leseVonDatei();
				break;
			case "5":
				System.out.println("ENDE");
				break;
			default:
				System.out.println("Falsche Eingabe!");
			}
		} while(eingabe!="3");
		scanner.close();
	}
}