package day05_if_logicals;

import java.util.Scanner;

public class IfQuestion4 {

	public static void main(String[] args) {
		
		/* Type java code by using if statement.
		 * When you enter the initial of the day of a week,
		 * output should be all possible names of the days.
		 * For example; if the initial is ‘S’ output should be 
		 * “Saturday or Sunday”
		 */
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter the initial of the days as uppercase");
        char initialOfTheDay = scan.next().charAt(0);
        
        if(initialOfTheDay=='S'+'s') {
            System.out.println("Saturday and Sunday");
        }
        if(initialOfTheDay=='T') {
            System.out.println("Thursday and Tuesday");
        }
        if(initialOfTheDay == 'W') {
            System.out.println("Wednesday");
        }
        if(initialOfTheDay == 'M') {
            System.out.println("Monday");
        }
        if(initialOfTheDay == 'F') {
            System.out.println("Friday");
        }
				
	}

}
