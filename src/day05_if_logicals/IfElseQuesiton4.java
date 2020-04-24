package day05_if_logicals;

import java.util.Scanner;

public class IfElseQuesiton4 {

	public static void main(String[] args) {

		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your age");
		int age1 = scan.nextInt();
		
		if(age1>18 && age1<65) {
			System.out.println("You should work");
		}else {
			System.out.println("No need to work");
		}
		
	}

}
