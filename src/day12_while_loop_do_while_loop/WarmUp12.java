package day12_while_loop_do_while_loop;

import java.util.Scanner;

public class WarmUp12 {

	public static void main(String[] args) {
	
	/*  Type a program by using while loop to print
	 *  first 10 letters on the console.
	 *  They should be on the same line and put space between them
	 */

		char letter = 'a';
		int count = 1;
		
		while (count<=10) {
			System.out.print(letter + " ");
			count++;
			letter++;
		}
		
		
		
		
		/*char c = 'a';
			
		while (c<='j') {
			System.out.print(c + " ");
			c++;
		}*/
	}
}