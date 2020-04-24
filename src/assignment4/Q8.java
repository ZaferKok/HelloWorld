package assignment4;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		/*Ask user to enter a word which has 4 letters. 
		 * If the first and the last letters of the word are same, 
		 * output will be “Same” Otherwise,
		 *the output will be “Different” Solve by using if statement.
*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 4 letters word");
		String word = scan.next();
		char f = word.charAt(0);
		char l = word.charAt(3);
		
		if (word.length()==4) {
		
			if (f==l) {
				System.out.println("Same");
			}else {
				System.out.println("Different");
			}
		
		}else {
			System.out.println("Enter only 4 character word");
		}

	}

}
