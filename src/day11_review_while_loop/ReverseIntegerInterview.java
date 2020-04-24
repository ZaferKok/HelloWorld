package day11_review_while_loop;

import java.util.Scanner;

public class ReverseIntegerInterview {

	public static void main(String[] args) {
		/*Ask user to enter an integer, then print its inverse on the console.(Interview Question) 
     If the last number is “12345” output will be “54321"
     */

		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = scan.nextLine();

		String reversedNum = "";

		for(int i=1; i<=str.length(); i++) {
		    reversedNum = reversedNum + str.charAt(str.length()-i);
		}
		System.out.println(reversedNum);
	
		int reversedInt = Integer.parseInt(reversedNum);
		System.out.println(reversedInt+1); // this is really integer. you can add some number to it
	
	
	
	
	
	}

}
