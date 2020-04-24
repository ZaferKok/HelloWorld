package assignment5;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		/*Ask user to enter a starting and an ending value, then print all integers
from starting value to ending value on the console in the same line. Put a space
between the numbers.
If the starting value is 5 and ending value is 11, output will be like: 5 6 7 8 9 10 11
*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter starting value");
		int s = scan.nextInt();
		System.out.println("Enter ending value");
		int e = scan.nextInt();
		
		
		int i;
		
		for (i = s; i<= e; i++) {
			System.out.print(i + " ");
		}
		
		
	
	}

}
