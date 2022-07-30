package com.bridgelab.userregistraction;

import java.util.Scanner;
import java.util.regex.*;
public class UserRegistraction {


	public static  void userValidation() {
		Scanner scanner = new Scanner(System.in);
		boolean check = true;

		while (check) {
			System.out.println("Enter Your option to validate\n  1.First Name\n  2.Last Name\n ");
			int option = scanner.nextInt();
			scanner.nextLine();

			switch (option) {
			case 1:
				final String FIRSTNAME = "([A-Z]{1}[a-zA-Z]{3,})";
				System.out.println("Enter First name :");
				String firstName = scanner.next();
				boolean  resultForFirstName = Pattern.matches(FIRSTNAME, firstName);
				System.out.println(resultForFirstName);
				if(resultForFirstName == false) {
					System.out.println("Enter valid First Name");
					break;
				}

			case 2:
				final String LASTNAME = "([A-Z]{1}[a-zA-Z]{3,})";
				System.out.println("Enter Last name :");
				String lastName = scanner.next();
				boolean  resultForLastName = Pattern.matches(LASTNAME, lastName);
				System.out.println(resultForLastName);
				if(resultForLastName == false) {
					System.out.println("Enter valid Last Name");
					break;
				}

			default:
				check = false;
				break;
			}
		}
	}
	public static void main(String[] args) {
		userValidation();
	}
}
