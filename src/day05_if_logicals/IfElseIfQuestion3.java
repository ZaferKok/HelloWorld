package day05_if_logicals;

import java.util.Scanner;

public class IfElseIfQuestion3 {

	public static void main(String[] args) {
		/*Type java code by using if-else statement.
		Write a program to check if a year is leap year or not.
		If a year is divisible by 4 but not 100 then it is leap year.
		if the year is divisible 400 it is leap year.
*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year");
		int year = scan.nextInt();
		
		
		if ((year % 400 == 0) || (year % 4 == 0 && year %100 != 0)) {  // short but complicated method
			System.out.println("This is leap year");
		}else {
			System.out.println("This is not leap year");
		}
		
		
		/*if (year % 400 == 0) {									// easy but long method
			System.out.println("This is leap year");
		}else if (year % 4 ==0 && year%100!=0) {
			System.out.println("This is leap year");
		}else {
			System.out.println("This is not leap year");	
		}*/
		
		
		
		
		
	}

}
