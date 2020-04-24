package assignment4;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		/*Ask user to enter a word which has 4 letters. 
		 * If the first and the last letters of the word 
		 * are same, output will be “Same” Otherwise,
the output will be “Different” Solve by using ternary.*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 4 letters word");
		String word = scan.next();
		char f = word.charAt(0);
		char l = word.charAt(3);
		
		String r =(f==l) ? "Same" : "Different";
		System.out.println(r);
		
	}

}
