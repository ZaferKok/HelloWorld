package assignment4;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		/*Ask user to enter the initials of the day of a week. If the initial is “S”, output will be “Saturday, Sunday”, if the initial is “M” output will
“Monday”, if the initial is “T” output will be “Tuesday, Thursday”, if the initial is “W” output will be “Wednesday”, if the initial is “F”
Output will be “Friday.”Otherwise, output will be “Not valid initial for the day names” Solve by using switch.*/

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter initial of the day of week");
		String week = scan.next();
		char day = week.charAt(0);
		
		switch(day) {
		case 'S':
			System.out.println("Saturday, Sunday");
			break;
		case 'M':
			System.out.println("Monday");
			break;
		case 'T':
			System.out.println("Tuesday, Thursday");
			break;
		case 'F':
			System.out.println("Friday");
			break;
		default:
			System.out.println("Enter only initial of the day");
		}
	}

}
