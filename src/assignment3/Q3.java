package assignment3;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		/*Ask user to enter a String. 
		 If the first letter of the String is “A”, output will be
		 “This String is starting with ‘A’.” Otherwise,
		 output will be “This String is not starting with ‘A’.”
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String word = scan.next();
		
		char a1 = word.charAt(0);
		
		switch (a1) {
			case 'A':
			System.out.println("This String is starting with ‘A’");
			break;
			
			default:
			System.out.println("This String is not starting with ‘A’.");
		}
		
	}

}
