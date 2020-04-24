package day12_while_loop_do_while_loop;

import java.util.Scanner;

public class DoWhileLoopQuestion05 {

	public static void main(String[] args) {
		/* Ask user to enter many names. 
		If the initial is uppercase give a 
		message like “Good”, otherwise finish 
		the loop and give a message like 
		 * “Make the initial uppercase”*/

		Scanner scan = new Scanner(System.in);
		
		String n;
		
		do {
			System.out.println("enter many names");
			n = scan.next();
			if(n.charAt(0)>='A' && n.charAt(0)<='Z') {
				System.out.println("Good. Go ahead!");
			}else {
				System.out.println("Make the initial uppercase");
			}
		}while (n.charAt(0)>='A' && n.charAt(0)<='Z');
	}
}
