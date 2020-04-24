package assignment3;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		/* Ask user to enter a String. 
		 * If the first letter of the String is “Z” 
		 * and if it has more than 4 characters
		 * output will be “Good String.” 
		 * Otherwise, output will be “Bad String”
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String u = scan.next();
		
		char c = u.charAt(0);
		
		if (u.length()>4 && c=='Z') {
			System.out.println("Good String");
		}else {
			System.out.println("Bad String");
		}
	}
}
