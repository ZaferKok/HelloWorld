package assignment2;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		/*Ask user to enter a 3 digit integer 
		 * then find the sum of all digits of that number.
		 */

		Scanner digit = new Scanner(System.in);
		System.out.println("enter 3 digits number");
		int num = digit.nextInt();
		
		int first = num/100;
		int second = (num/10)%10;
		int third = num%10;
		System.out.println("the number that you entered: " +num);
		System.out.println("the sum of the digits in this"
				+ " number is : " + (first + second + third));
		
	}

}
