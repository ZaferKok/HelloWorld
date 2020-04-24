package assignment2;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		/*Ask user to enter seconds then convert seconds to hours.
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter seconds");
		float seconds = scan.nextFloat();
			
		System.out.println((float)seconds/3600 + " Hour ");

		//BENIM COZUM ASAGIDA AMA YUKARIDAKI DAHA PRATIK
		//float hours = seconds/3600;
		//System.out.println("The seconds are equal to : " + hours + "hours");
			
	}

}
