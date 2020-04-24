package day05_if_logicals;

import java.util.Scanner;

public class IfQuestion2 {

	public static void main(String[] args) {

		/*
		 * Ask user to enter the values of length and width
		 * of a rectangle, 
		 * then check if it is square or not.
		 */	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the length of a rectangle");
		int len = scan.nextInt();
		System.out.println("Please enter the width of a rectangel");
		int wid = scan.nextInt();
		
		if(len == wid) {
		System.out.println("This is a square, not a rectangle");	
		}
		if(len !=wid) {
		System.out.println("This is a rectangle");
	
		}
	}
}
