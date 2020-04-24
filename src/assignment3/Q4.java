package assignment3;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		/*Ask user to enter 2 chars in uppercase. 
		 * Print them on the console in alphabetical order.
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character uppercase");
		char u1 = scan.next().charAt(0);
		System.out.println("Enter another character uppercase");
		char u2 = scan.next().charAt(0);
		
				
		if (u1>='A' && u1<='Z' && u2>='A' && u2<='Z')  {
			if (u1>u2) {
				System.out.println("Your characters are : " + u1 + " and " + u2);
				System.out.println("Alphabetical order is : " + u2 + " and " + u1);
			}else {
				System.out.println("Your characters are : " + u1 + " and " + u2);
				System.out.println("Alphabetical order is : " + u1 + " and " + u2);
			}
		}else {
		System.out.println("Please enter your characaters uppercase from alphabet and one by one");
		}
	}
}
