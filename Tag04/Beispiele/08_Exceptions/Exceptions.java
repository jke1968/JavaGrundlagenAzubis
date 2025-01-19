package de.lbbw;

import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {
		System.out.println("ENTER main");
		int[] numbers = new int[5];
		Scanner scanner = new Scanner(System.in);
		String input = "";
		int number = 0;
		int counter = 0;
		// lese Zahlen und speichere sie im Array
		do {
			System.out.println("Bitte ganze Zahl eingeben: ");
			input = scanner.nextLine();
			// versuche, den String "input" in die int-Zahl "number"
			// zu konvertieren:
			try {
				// wenn parseInt eine Exception erzeugt (oder auch: "wirft")
				// dann wird in den catch-Block verzweigt
				number = Integer.parseInt(input);
				// wenn nicht, dann geht es hier weiter:
				numbers[counter] = number;
				counter++;
				if(counter==numbers.length) {
					break; // verlässt die Schleife sofort
				}
			} catch (NumberFormatException ex) {
				System.out.println("Fehler bei der Eingabe:");
				System.out.println("Die Eingabe "+input+" konnte nicht in eine Zahl konvertiert werden");
			}
		} while(true);
		// gib alle Zahlen im Array aus
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		scanner.close();
		System.out.println("EXIT main");
	}

}
