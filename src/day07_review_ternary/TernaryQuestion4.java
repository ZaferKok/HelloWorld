package day07_review_ternary;

import java.util.Scanner;

public class TernaryQuestion4 {

	public static void main(String[] args) {
		/*
		 * Type java code by using using ternary.
Take values of length and breadth of a rectangle from 
user and check if it is square or not.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle");
		int length = scan.nextInt();
		System.out.println("Enter the width of the rectangle");
		int width = scan.nextInt();
		
		String same = length == width ? "It is square" : "It is rectangle";
		System.out.println(same);
	}

}
