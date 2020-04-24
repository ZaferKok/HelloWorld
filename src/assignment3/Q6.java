package assignment3;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		/* Ask user to enter a String. 
		 * If the first letter of the String is 
		 * “A” or if it has less than 4 characters
		 *	output will be “Weird String.” Otherwise, 
		 * output will be “Normal String”
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String u = scan.next();
		
		char c = u.charAt(0);
		
		if (u.length()<4 || c=='A') {
			System.out.println("Weird String");
		}else {
			System.out.println("Normal String");
		}
	}
		
}
