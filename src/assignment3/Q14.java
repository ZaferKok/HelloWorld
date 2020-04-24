package assignment3;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		/*Ask user to enter 2 letters. If user entered two uppercase letters, output will be
“Good Job, both are uppercases.” If user entered two lowercase letters, output will be
“Good Job, both are lowercases.” Otherwise, output will be “I am confused”
*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two characters");
		char a = scan.next().charAt(0);
		char b = scan.next().charAt(0);
		
		
		if (a>='A' && a<='Z' && b>='A' && b<='Z') {
			System.out.println("Good Job, both are uppercases.");
		}else if (a>='a' && a<='z' && b>='a' && b<='z') {
			System.out.println("Good Job, both are lowercases.");
		}else {
			System.out.println("I am confused");
		}
		
	}

}
