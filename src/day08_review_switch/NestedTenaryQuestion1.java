package day08_review_switch;

import java.util.Scanner;

public class NestedTenaryQuestion1 {

	public static void main(String[] args) {
		/* Type java code by using nested ternary.
		Write a program to check if a year is leap year or not.
		If the year is divisible by 100 then it must be divisible by 400.
		If a year is not divisible by 100 then it must be divisible by 4.
*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year");
		int y = scan.nextInt();
			
		String that = y%100==0 ? (y%400==0 ? "Leap Year" : 
			"Not Leap Year") : (y%4==0 ? "Leap Year" : "Not Leap Year") ;
		System.out.println(that);
	}
}

/*Scanner scan = new Scanner(System.in);
System.out.println("Enter year");
int x = scan.nextInt();

String result = (x%100==0) ? (x%400==0 ? "leap year" : "not leap year") : (x%4==0 ? "leap year" : "not leap year");

System.out.println(result);
*/