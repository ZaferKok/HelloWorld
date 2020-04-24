package assignment3;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		/*Ask user to enter a char. If user entered an uppercase letter then check if it is ‘A’ or ‘B’, output will be
“You entered an uppercase letter and it is one of the first two uppercases.” If user entered a lowercase letter
then check if it is ‘y’ or ‘z’, output will be “You entered an lowercase letter and it is one of the last
two lowercases.”Otherwise, output will be “I do not know that char.”
	*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first char");
		char c = scan.next().charAt(0);
	
		if (c>='A' && c<='Z') {
			if (c=='A' || c=='B') {
				System.out.println("You entered an uppercase letter and it is one of the first two uppercases.");
			}else {
				System.out.println("I do not know that char.");
			}
			
		}else if (c>='a' && c<='z') {
			if (c=='y' || c=='z') {
				System.out.println("You entered an lowercase letter and it is one of the last two lowercases.");
			}else {
				System.out.println("I do not know that char.");
			}				
		}else {
			System.out.println("I do not know that char.");

	}
	}
}
