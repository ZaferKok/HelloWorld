package day06_nested_if;

import java.util.Scanner;

public class ReviewQuestion2 {

	public static void main(String[] args) {

		/*Ask user to enter a String and output will be 
		 * the number of the characters in the String.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word or sentence");
		String str = scan.nextLine();
		System.out.println("The String user entered : "+str);
		System.out.println("The number of charactes : " + str.length());
		
		//in java space also a character
	}

}
