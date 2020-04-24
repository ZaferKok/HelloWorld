package assignment3;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		/*Ask user to enter three chars. 
		 * Print them on the console in alphabetical order.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first char");
		char c1 = scan.next().charAt(0);
		System.out.println("Enter second char");
		char c2 = scan.next().charAt(0);
		System.out.println("Enter third char");
		char c3 = scan.next().charAt(0);
		
		if (c1 > -2000000000 && c1<2000000000) {
			c1 = '0';c2='0';c3='0';
		}
		if (c1>c2 && c2>c3) {
			System.out.println(c3+" - "+c2+" - "+c1);
		}else if (c1>c3 && c3>c2) {
			System.out.println(c2+" - "+c3+" - "+c1);
		}else if (c2>c1 && c1>c3) {
			System.out.println(c3+" - "+c1+" - "+c2);
		}else if (c2>c3 && c3>c1) {
			System.out.println(c1+" - "+c3+" - "+c2);
		}else if (c3>c1 && c1>c2) {
			System.out.println(c2+" - "+c1+" - "+c3);
		}else if (c3>c2 && c2>c1) {
			System.out.println(c1+" - "+c2+" - "+c3);
		}else {
			System.out.println("Enter char");
		}
		
	}

}
