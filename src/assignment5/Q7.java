package assignment5;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		/*Ask user to enter a starting and an ending value, then print the product of all
integers from starting value to ending value on the console.
If the starting value is 5 and ending value is 9, output will be 15120 because 5x6x7x8x9=15120
*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter starting value");
		int s = scan.nextInt();
		System.out.println("Enter ending value");
		int e = scan.nextInt();

		int i;
		int sum = 1;
		
		for (i=s; i<=e; i++) {
			sum = sum * i;
		}
		System.out.println(sum);
	

	}

}
