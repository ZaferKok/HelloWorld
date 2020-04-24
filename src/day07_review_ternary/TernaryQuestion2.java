package day07_review_ternary;

import java.util.Scanner;

public class TernaryQuestion2 {

	public static void main(String[] args) {
		/*
		 * Type java code by using ternary. 
		 * Ask user to enter two integers
Write a program to print the minimum one on the console.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two integer");
		int first = scan.nextInt();
		int second = scan.nextInt();
		
		int result = first <= second ? first : second;
		System.out.println(result);
	}

}
