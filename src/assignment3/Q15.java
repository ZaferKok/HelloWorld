package assignment3;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		/*Ask user to enter first name and last name. If the first name and the last name are same, output will be
“Your first name and last name are same.” If the first name is longer than the last name, output will be
“Your first name is longer than your last name.” Otherwise, output will be “Okay no problem.”
*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name");
		String fn = scan.next();
		System.out.println("Enter your last name");
		String ln = scan.next();
		
		if (fn.equals(ln)) {
			System.out.println("Your first name and last name are same.");
		}else if (fn.length()>ln.length()) {
			System.out.println("Your first name is longer than your last name.");
		}else {
			System.out.println("Okay no problem.");
		}
	}
}
