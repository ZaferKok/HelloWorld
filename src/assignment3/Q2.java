package assignment3;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		/*Ask user to enter two integers. 
		 * Print them on the console in ascending order.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two integer");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if (a>b) {
			System.out.println("Ascendin order");
			System.out.println(b);
			System.out.println(a);
		}else {
			System.out.println("Ascending order");
			System.out.println(a);
			System.out.println(b);
		}
		
		
		
	}

}
