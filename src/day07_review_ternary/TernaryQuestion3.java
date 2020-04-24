package day07_review_ternary;

import java.util.Scanner;

public class TernaryQuestion3 {

	public static void main(String[] args) {
		/*
		 * Type java code by using ternary.
Write a program to print absolute value of an 
integer entered by user.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int int1 = scan.nextInt();
		
		int int2 = int1 < 0 ? (int1*-1) : int1;
		System.out.println(int2);
		
	}

}
