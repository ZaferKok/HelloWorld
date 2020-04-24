package day05_if_logicals;

import java.util.Scanner;

public class WarmUp5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any name of the week");
		String nameOfTheDay = scan.next();
		
		char secondLetter = nameOfTheDay.charAt(1);
		char fourthLetter = nameOfTheDay.charAt(3);
		char sixthLetter = nameOfTheDay.charAt(5);
		
		System.out.println("" + secondLetter + fourthLetter + sixthLetter);
		
		
	}

}
