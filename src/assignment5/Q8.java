package assignment5;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		/*Ask user to enter his/her first name,
		 *  then print the letters of the first name on the
console from top to down.
If the first name is John out put will be like; 

										J
										o
										h
										n

*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
		String n = scan.nextLine();
		//Zafer
		
		int l = n.length();
		int i;
		
		for (i=0; i<l; i++) {
			
			char c = n.charAt(i);
			System.out.println(c);
		}
		
		// MY SOLUTION
	/*	int l = n.length();
		
		for (int i=l; i>0; i--) {
			System.out.println(n.substring(l-i, (l-i+1)));
		}*/
	}
}
