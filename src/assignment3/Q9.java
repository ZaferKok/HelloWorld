package assignment3;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		/*Ask user to enter three integers. 
		 * Print them on the console in ascending order
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first integer");
		int a = scan.nextInt();
		System.out.println("Enter second integer");
		int b = scan.nextInt();
		System.out.println("Enter third integer");
		int c = scan.nextInt();
		
				
		if (a>b && b>c) {
			System.out.println(c+" < "+b+" < "+a);
		}else if (a>c && c>b) {
			System.out.println(b+" < "+c+" < "+a);
		}else if (c>a && a>b) {
			System.out.println(b+" < "+a+" < "+c);
		}else if (c>b && b>a) {
			System.out.println(a+" < "+b+" < "+c);
		}else if (b>a && a>c) {
			System.out.println(c+" < "+a+" < "+b);
		}else if (b>c && c>a) {
			System.out.println(a+" < "+c+" < "+b);
		}else {
			System.out.println("Enter integer");
		}
	}
}
