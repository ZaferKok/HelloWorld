package day11_review_while_loop;

import java.util.Scanner;

public class WhileLoopQuestion3 {

	public static void main(String[] args) {
		/*Type java code by using while loop,
Write a program that prompts the user to input a positive integer.
It should then print the multiplication table of that number.*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive integer");
		int p = scan.nextInt();
				
		int i = 1;
		
		while (i<=10) {
			System.out.println(p + " x " + i + " = " + p*i);
			i++;
		}
	}
}
