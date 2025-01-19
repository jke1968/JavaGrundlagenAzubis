package de.lbbw;

import java.util.Scanner;

public class Uebung02 {

	public static void main(String[] args) {
		String username1 = "Peter";
		String username2 = "Mary";
		String password1 = "ABC123<+>";
		String password2 = "PasswordThatIsLongerThanYourUsualPassword";
		String inputUsername = "";
		String inputPassword = "";
		Scanner scanner = new Scanner(System.in);
		System.out.print("Username: ");
		inputUsername = scanner.next();
		System.out.print("Password: ");
		inputPassword = scanner.next();
		if (inputUsername.equals(username1)) {
			if (inputPassword.equals(password1)) {
				System.out.println("Logged in");
			} else {
				System.out.println("Wrong username or password");
			}
		} 
		if (inputUsername.equals(username2)) {
			if (inputPassword.equals(password2)) {
				System.out.println("Logged in");
			} else {
				System.out.println("Wrong username or password");
			}
		} else {
			System.out.println("Wrong username or password");
		}
	}
}
