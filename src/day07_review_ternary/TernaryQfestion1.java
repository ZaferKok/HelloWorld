package day07_review_ternary;

import java.util.Scanner;

public class TernaryQfestion1 {

	public static void main(String[] args) {
		/*Type java code by using ternary, Ask user to enter 
		 * an integer, if the integer is even,
output will be “The integer is even”. If the integer is odd, 
output will be “The integer is odd”.
*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int num = scan.nextInt();
		
		String result = num % 2 == 0 ? "even" : "odd";	
		System.out.println(result);
	}

}
