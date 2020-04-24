package day05_if_logicals;

import java.util.Scanner;

public class IfElseIfQuestion1 {

	public static void main(String[] args) {
/*Type java code by using if-else if() statement,
if both of the two integers are positive, output will be the sum of them.
If both of the two integers are negative, output will be the multiplication of them.
Otherwise; output will be “I cannot add or multiply different signed numbers”
*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first integer");
		int nu1 = scan.nextInt();
		System.out.println("Enter second integer");
		int nu2 = scan.nextInt();
		
		if(nu1>0 && nu2>0) {
			System.out.println("Both are positive therefore I am adding : " + (nu1+nu2));
		}else if(nu1<0 && nu2<0) {
			System.out.println("Both are negative therefore I am multiplying : " + (nu1*nu2));
		}else {
			System.out.println("I cannot add or multiply different signed numbers");
		}
		
	//  zero has no any sign. it is nötr.	
	}

}
