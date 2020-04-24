package day07_review_ternary;

import java.util.Scanner;

public class WarmUp7 {

	public static void main(String[] args) {
		/*Ask user to enter his/her first and last name. If the first name is longer
output will be “First name is longer.” If the length of last name is equal
To the length of last name output will be “First name and last name
have same length.” Otherwise, output will be “Last name is longer”
*/
				Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scan.next();
		System.out.println("Ente your lastname");
		String lastname = scan.next();
		
		if (name.length() > lastname.length()) {
			System.out.println("First name is longer");
		}else if (name.length() == lastname.length()) {
			System.out.println("First name and last name\r\n" + 
					"have same length");
		}else {
			System.out.println("Last name is longer");
		}
	}

}
