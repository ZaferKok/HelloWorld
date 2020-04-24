package assignment3;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
	/*
		Ask user to enter an integer. 
		If the number has 3 digits, output will be
		“This number has 3 digits.” Otherwise, 
		output will be “This number has no 3 digits.”
	 */
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter an integer");
	 int a = scan.nextInt();
	 
	 if ((a>99 && a<1000) || ( a>-1000 && a<-99 )) {
		
		 System.out.println("This number has 3 digits");
	 }else {
		 System.out.println("This number has no 3 digits");
	 }
		
		
	}
}
