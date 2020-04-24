package assignment5;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		/*Ask user to enter a password which has two words and a space
between the words. Change the initials of the words to “ * ”
Output should be like: *ohn *alker
*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a password which has two words");
		String p = scan.nextLine();

		
		//System.out.println(p.contains(" "));
		
		int idx1 = p.indexOf(" ");
		System.out.println(idx1);
		
		System.out.println(p.substring(0, 1).replaceAll("\\w", "*") + p.substring(1, idx1).toLowerCase() 
			+ " " + p.substring(idx1+1, idx1+2).replaceAll("\\w", "*") + p.substring(idx1+2).toLowerCase());

		
	}

}
