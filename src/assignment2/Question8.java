package assignment2;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		/*Ask user to enter number of days,
then calculate the hours, minutes,
and seconds.*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the days");
		int day = scan.nextInt();
		
		System.out.println(day + " day is equal to " + (day * 24) + " hours");
		System.out.println(day + " day is equal to " + (day*24*60) + " minutes");
		System.out.println(day + " day is equal to " + (day*24*60*60) + " seconds");
	}

}
