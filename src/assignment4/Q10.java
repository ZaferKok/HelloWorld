package assignment4;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		/*Ask user to enter two words.
		 * If the length of the first and 
		 * the second words are equal, output
		 *  will be “Equal length.” Otherwise,
		 *  the output will be “Not equal length” 
		 *  Solve by using if statement.*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 words");
		String w1 = scan.next();
		String w2 = scan.next();
	
		
		if (w1.length()==w2.length()) {
			System.out.println("Equal length");
		}else {
			System.out.println("Not equal length");
		}
		
	}

}
