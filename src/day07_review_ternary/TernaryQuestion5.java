package day07_review_ternary;

import java.util.Scanner;

public class TernaryQuestion5 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter an integer. If the number has 3 digits, 
		 * output will be
“This number has 3 digits.” Otherwise, output will be 
“This number has no 3 digits.”
How can you decide the number of digits of an integer?
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		
		//String num = scan.next();
		//String that = num.length() == 3 ? "This number has 3 digits" :
		//	"This number has no 3 digits";
		//System.out.println(that);
		
		int num = scan.nextInt();
		String that = (num > 99 && num < 1000) ? "This number has 3 digits" :
		"This number has no 3 digits";
		System.out.println(that);
	}
}
