package assignment3;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		/* Ask user to enter a number for price of a shirt. 
		 * If it is greater than $100, output will be
		 *  “Expensive” If it is greater than $70, 
		 *  output will be “Not Expensive.” 
		 *  Otherwise, output will be “Cheap”
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter price");
		int a = scan.nextInt();
	
	//NESTED TENARY
		
	String deg = a>100 ? 
			"exp" : (a>70 ? "not Exp" : "cheap");
	System.out.println("The price is "+ deg);
	}

}
