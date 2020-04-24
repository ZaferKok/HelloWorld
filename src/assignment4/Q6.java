package assignment4;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		/*Ask user to enter a character. If it is uppercase, output will be “Uppercase” Otherwise,
the output will be “Lowercase” Solve by using if statement.*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character");
		String s = scan.next();
		char c = s.charAt(0);
		
		if(s.length()==1) {
					
			if (c>='A' && c<='Z') {
				System.out.println("Uppercase");
			}else if (c>='a' && c<='z') {
				System.out.println("Lowercase");
			}else {
				System.out.println("This is not a letter");
			}
		}else {
			System.out.println("Enter only one character");
		}
		
	}

}
