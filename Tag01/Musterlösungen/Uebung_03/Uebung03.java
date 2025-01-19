package de.lbbw;

import java.util.Scanner;

public class Uebung03 {
	public static void main(String[] args) {
		String name = "";
		int counter = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte Namen eingeben: ");
		name = scanner.nextLine();
		int starsToPrint = "Willkommen".length()+name.length()+5;
		// print first line of stars
		while(counter < starsToPrint) {
			System.out.print("*");
			counter = counter + 1;
		}
		System.out.println();
		// print greeting
		System.out.println("* Willkommen "+name+" *");
		// print second line of stars
		counter = 0;
		while(counter < starsToPrint) {
			System.out.print("*");
			counter = counter + 1;
		}
		System.out.println();
		scanner.close();
	}
}
