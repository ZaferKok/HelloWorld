package assignment4;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		/*Ask user to enter a two digits integer. If the sum of the digits of the integer is divisible
		by 3, output will be “The number is divisible by 3.” Otherwise, the output will be “This number is not
		Divisible by 3.” Solve by using if statement.*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two digits integer");
		int n = scan.nextInt();
		
		int a = n/10;
		int b = n%10;
		
		if ((a+b)%3==0) {
			System.out.println("The number is divisible by 3.");
		}else {
			System.out.println("The number is not divisible by 3.");
		}
		
		
		
	}

}
