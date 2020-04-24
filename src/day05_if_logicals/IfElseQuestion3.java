package day05_if_logicals;

import java.util.Scanner;

public class IfElseQuestion3 {

	public static void main(String[] args) {

		/*Type java code by using if-else statement.
A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity then judge and print total cost for user.
If the quantity is less than 1000 output will be “No discount.”*/
		
	Scanner scan = new Scanner(System.in);	
	System.out.println("Enter the quantity and price per item");
	int qty = scan.nextInt();
	int pricePerItem = scan.nextInt();
	
	if (qty>1000) {
		System.out.println("The price is " + (qty*pricePerItem*0.9) + " % 10 discount" );
	}else {
		System.out.println("The prise is " + (qty*pricePerItem) + " No discount");
	}
		
		
	}

}
