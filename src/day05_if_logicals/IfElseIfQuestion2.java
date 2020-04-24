package day05_if_logicals;

import java.util.Scanner;

public class IfElseIfQuestion2 {

	public static void main(String[] args) {
		
	/*	Type java code by using if-else if() statement,
		If age is less than 13 output will be “Should not work”,
		If age is greater than 65 output will be “Retired”,
		Otherwise; output will be “Should work”
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age");
		int a = scan.nextInt();
		
		if(a<13) {
			System.out.println("You should not work");
		}else if (a>65){
			System.out.println("Retired");
		}else {
			System.out.println("Should work");
		}
	}
}

