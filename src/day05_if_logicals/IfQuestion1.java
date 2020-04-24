package day05_if_logicals;

import java.util.Scanner;

public class IfQuestion1 {

	public static void main(String[] args) {

		
		/*Type java code, if an integer is even, 
		 * output will be “The integer is even”. 
      	 * If the integer is odd, output will be 
         * “The integer is odd”
		 */
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter an integer");
		int num = scan.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("The integer is even");
		}
		if (num % 2 != 0) {
			System.out.println("The integer is odd");
		}
	}

}
