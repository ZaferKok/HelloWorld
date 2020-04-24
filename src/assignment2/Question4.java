package assignment2;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		
		/*Ask user to enter the milage, 
		 * then calculate the cost of the trip 
		 * if gas is $2.50 a gallon 
		 * and the car gets 36 miles per gallon.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your distance of trip");
		float distance = scan.nextFloat();
		
		float aMilePrice = 2.50f / 36;
		System.out.println("The price of your trip is : " + (distance * aMilePrice) + "$");
		
	

	}

}
