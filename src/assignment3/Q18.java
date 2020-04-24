package assignment3;

import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {
		/*Ask user to enter an integer. If user entered a negative integer then check if it is less than -10, output will be
“This is very small integer.” If user entered a positive integer then check if it is greater than 100, output will be
“This is very big integer.” Otherwise, output will be “This is neither small nor big.”
*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int a = scan.nextInt();
		
		
		if(a<0) {
			if(a<-10) {
			System.out.println("This is very small integer.");	
			}else {
				System.out.println("This is neither small nor big.");
			}
		}else if (a>0) {
			if(a>100) {
			System.out.println("This is very big integer.");
			}else {
				System.out.println("This is neither small nor big.");
			}
		}else {
			System.out.println("This is neither small nor big.");
		}
			
	}

}
