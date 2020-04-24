package assignment5;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		/*Ask user to enter his/her first name, last name, and gender.
a)Make all characters of first name uppercase
b)Make initial of the last name uppercase, all other characters lowercase
c)Change all characters of the gender to “ * ”
Output should be like: JOHN Walker ****
*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an your first name, last name and gender");
		String fn = scan.next();
		String ln = scan.next();
		String g  = scan.next();
		
		System.out.print(fn.toUpperCase() + " ");
		System.out.print(ln.substring(0, 1).toUpperCase() + ln.substring(1).toLowerCase() + " ");
		System.out.print(g.replaceAll("\\w", "*"));
		
		

	}

}
