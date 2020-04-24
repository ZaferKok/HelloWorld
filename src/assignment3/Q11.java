package assignment3;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		
	/*Ask user to enter a String. 
	 * If it has more than 7 characters, 
	 * output will be “Good.”
		If it has more than 4 characters, 
		output will be “Not Bad.”
 		Otherwise, output will be “Bad”
	 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String a = scan.next();

		if (a.length()>7) {
			System.out.println("Good");
		}else if (a.length()>4) {
			System.out.println("Not Bad");
		}else {
			System.out.println("Bad");
		}
	}

}
