package assignment2;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		/*Ask user to enter the amount of his/her money, 
		 * and the price of a wing.
Then calculate the piece of the wing that user can buy.
Remember that you cannot buy part of a wing.
*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your amount of money");
		int money = scan.nextInt();
		
		System.out.println("Enter the price of a wing");
		int wing = scan.nextInt();
		
		System.out.println("You can buy " + money/wing + " wings");

		
		//  System.out.println((int)(money/wing)+" Wing you can buy");


	}

}
