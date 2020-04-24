package day05_if_logicals;

import java.util.Scanner;

public class HowToGetCharFromUser {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the initials of yoru first and last name");
		char initialOfTheFirstName = scan.next().charAt(0);
		char initialOfTheLastName = scan.next().charAt(0);
		
		System.out.println("Firt name initial : " + initialOfTheFirstName);
		System.out.println("Firt name initial : " + initialOfTheLastName);
	
	}

}
