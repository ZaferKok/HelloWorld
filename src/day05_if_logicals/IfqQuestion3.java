package day05_if_logicals;

import java.util.Scanner;

public class IfqQuestion3 {

	public static void main(String[] args) {
		/* Type java code by using if statement. 
		 * When you enter the name of the day of a week,
		 * output will be “Weekday” or “Weekend day” according to 
		 * the name of the day.
		 */
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter the name of the week, start with uppercase");
	String dayOfTheWeek = scan.next();
	
	/*“==” checks the value and the address of the Strings However, equals() 
	 * and equalsIgnoreCase() checks just values
	 */
	
	if(dayOfTheWeek.equalsIgnoreCase("Saturday")) { 	// While compare Strings DO NOT use "=="
		System.out.println("Weekend day"); 				// Use equals() or equalsIgnoreCase()
		}												// Because "==" is just check the value and the address of the Strings
	if(dayOfTheWeek.equalsIgnoreCase("Sunday")) { 		// address can not be found so i gives fault
		System.out.println("Weekend day");				// However, equals() or equalsIgnoreCase() just check values
		}
	if(dayOfTheWeek.equalsIgnoreCase("Monday")) { 		
		System.out.println("Week day");
		}
	if(dayOfTheWeek.equalsIgnoreCase("Tuesday")) { 		
		System.out.println("Week day");
		}
	if(dayOfTheWeek.equalsIgnoreCase("Wednesday")) { 		
		System.out.println("Week day");
		}
	if(dayOfTheWeek.equalsIgnoreCase("Thursday")) { 		
		System.out.println("Week day");
		}
	if(dayOfTheWeek.equalsIgnoreCase("Friday")) { 		
		System.out.println("Week day");
		}
	}

}
