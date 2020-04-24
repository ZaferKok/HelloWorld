package assignment4;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		/*Ask user to enter his first and last name. If the both initials are uppercases
output will be “True”, otherwise output will be “False.” Solve by using ternary*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name");
		String nm = scan.next();
		System.out.println("Enter your last name");
		String ln = scan.next();
		char n = nm.charAt(0);
		char l = ln.charAt(0);
		
		String r = n>='A' && n<='Z' && l>='A' && l<='Z' ? "True" : "False";
		System.out.println(r);
	}

}
