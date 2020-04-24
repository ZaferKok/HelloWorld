package assignment5;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		/*Ask user to enter his/her first name, then change every letter to the next letter.
(First name should not contain the letter “Z” or “z”)
If the first name is Abc output will be Bcd
*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
		String n = scan.next();
		
		int l = n.length();
		int i;
		
		for (i=0; i<l; i++) {
			
			char c = n.charAt(i);
			if(c != 'z' && c != 'Z') {
				System.out.println(++c); 
			}
		}
	}
}

           
