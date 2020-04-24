package assignment4;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		/*Ask user to enter two words. 
		 * If the length of the first and the 
		 * second words are equal, output will be 
		 * “Equal length.” Otherwise,
		 * the output will be “Not equal length” 
		 * Solve by using ternary.*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 words");
		String w1 = scan.next();
		String w2 = scan.next();
	
		
		String r = w1.length()==w2.length() ? "Equal length" : "Not equal length";
		System.out.println(r);
		
	}

}
