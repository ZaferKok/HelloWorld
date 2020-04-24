package assignment3;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		/*Ask user to enter 3 chars. If user entered them in alphabetical order, output will be
		“Good Job, the chars are in alphabetical order.” If user entered just first two in alphabetical order,
		output will be “Just first two chars are in alphabetical order.” Otherwise, output will be “Put them in order”
		*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first char");
		char c1 = scan.next().charAt(0);
		System.out.println("Enter second char");
		char c2 = scan.next().charAt(0);
		System.out.println("Enter third char");
		char c3 = scan.next().charAt(0);
		
		
		if (c3>c2 && c2> c1) {
			System.out.println("Good Job, the chars are in alphabetical order.");
		}else if (c2>c1) {
			System.out.println("Just first two chars are in alphabetical order.");
		}else {
			System.out.println("Put them in order");
		}
		
	}

}
