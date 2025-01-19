package de.lbbw;

import java.util.Scanner;

public class Uebung04 {
	
	
	public static void printAllNumbers(int lowerbound, int upperbound) {
		for(int i=lowerbound; i<=upperbound; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void printEvenNumbers(int lowerbound, int upperbound) {
		for(int i=lowerbound; i<=upperbound; i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	public static int sum(int lowerbound, int upperbound) {
		int sum = 0;
		for(int i=lowerbound; i<=upperbound; i++) {
			sum += i;
		}
		return sum;
	}
	public static int sumOfOddNumbers(int lowerbound, int upperbound) {
		int sum = 0;
		for(int i=lowerbound; i<=upperbound; i++) {
			if(i%2!=0) {
				sum += i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter main");
		int lowerbound = 0;
		int upperbound = 0;
		String choice = "";
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Was wollen Sie tun?");
			System.out.println("1 - Unter- und Obergrenze eingeben");
			System.out.println("2 - Alle Zahlen zwischen Unter- und Obergrenze ausgeben");
			System.out.println("3 - Alle geraden Zahlen zwischen Unter- und Obergrenze ausgeben");
			System.out.println("4 - Die Summe aller Zahlen zwischen Unter- und Obergrenze ausgeben");
			System.out.println("5 - Die Summe aller ungeraden Zahlen zwischen Unter- und Obergrenze ausgeben");
			System.out.println("6 - Programm beenden");
			choice = scanner.nextLine();
			switch(choice) {
			case "1":
				System.out.print("Untergrenze: ");
				lowerbound = Integer.parseInt(scanner.nextLine());
				System.out.print("Obergrenze: ");
				upperbound = Integer.parseInt(scanner.nextLine());
				break;
			case "2":
				printAllNumbers(lowerbound, upperbound);
				break;
			case "3":
				printEvenNumbers(lowerbound, upperbound);
				break;
			case "4":
				System.out.println("Summe aller Zahlen: ");
				System.out.println(sum(lowerbound, upperbound));
				break;
			case "5":
				System.out.println("Summe aller ungeraden Zahlen: ");
				System.out.println(sumOfOddNumbers(lowerbound, upperbound));
				break;
			case "6":
				System.out.println("Auf Wiedersehen");
				break;
			}
		} while (!choice.equals("6"));
		scanner.close();
		System.out.println("Exit main");
	}
}
