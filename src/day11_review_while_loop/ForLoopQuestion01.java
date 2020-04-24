package day11_review_while_loop;

import java.util.Scanner;

public class ForLoopQuestion01 {

	public static void main(String[] args) {
	
	
	/*Two numbers are entered through the keyboard.
	 * First is base, second is power. 
	 Write a program to find the value of 
	 first number raised to the power of the second.
	 For example; if the numbers are 2 and 3, 
	 output will be 8. Because 2x2x2(three times) = 8
	 */
	
		Scanner scan = new Scanner(System.in);
		System.out.println("enter first base number");
		int f = scan.nextInt();
		System.out.println("enter its power");
		int p = scan.nextInt();
		
		//2*2*2
		
		int mult = 1;
		int i;
		
		for (i=1; i<=p; i++) {
			mult = mult * f;
			
		}
		System.out.println(mult);
		
	}
}
