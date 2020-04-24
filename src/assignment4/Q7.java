package assignment4;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		/*Ask user to enter a character. 
		 * If it is uppercase, output will be “Uppercase” 
		 * Otherwise the output will be “Lowercase” Solve by using ternary.
*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character");
		char c = scan.next().charAt(0);
		
		String r = c>='A' && c<='Z' ? "Uppercase" : "Lowercase";
			System.out.println(r);
	}

}
