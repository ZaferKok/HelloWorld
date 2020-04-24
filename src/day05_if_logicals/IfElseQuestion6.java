package day05_if_logicals;

import java.util.Scanner;

public class IfElseQuestion6 {

	public static void main(String[] args) {

		// ask user to enter a character then check whether the character is alphabet or not
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the character to check if it is alphabet");
		char ch = scan.next().charAt(0);
		
		if ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
			System.out.println("The character is an alphabet");
		}else {
			System.out.println("The character is not an alphabet");
		}
				
	}

}
