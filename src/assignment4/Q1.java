package assignment4;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		/*Ask user to enter his first and last name. If the both initials are uppercases
output will be “True”, otherwise output will be “False.” Solve by using if statement.*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name");
		String nm = scan.next();
		System.out.println("Enter your last name");
		String ln = scan.next();
		char n = nm.charAt(0);
		char l = ln.charAt(0);
		
		if (n>='A' && n<='Z' && l>='A' && l<='Z') {
		System.out.println("True");
		}else {
			System.out.println("False");
		}
		
	}

}
