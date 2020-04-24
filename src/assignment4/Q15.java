package assignment4;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		/*Ask user to enter an integer. 
		 * If the integer is divisible by 5, 
		 * output will be “Divisible by 5”, 
		 * Otherwise, output will be “Not divisible
		 *By 5” Solve by using ternary.*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		double num = scan.nextInt();
		
		String r = (num%5==0) ? "Divisible by 5" : "Not divisible by 5";
			System.out.println(r);
	}

}
