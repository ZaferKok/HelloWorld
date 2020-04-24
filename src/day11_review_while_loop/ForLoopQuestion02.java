package day11_review_while_loop;

import java.util.Scanner;

public class ForLoopQuestion02 {

	public static void main(String[] args) {
		/*Write a program that prompts the user to input a positive integer. 
		 It should then output a message indicating whether the number is a prime number. 
		 Hint: Prime numbers are not divisible by any number except 1 and the number itself
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int n = scan.nextInt();
	
		boolean result = true; // If you create a variable outside the loop and
								// change its value inside the loop it is called flag.
		
		int i;
		
		for (i=2; i<n; i++) {
			if (n%i==0) {
				result = false;
				break;
			}
		}
		if (result==true) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}
		
	}

}
