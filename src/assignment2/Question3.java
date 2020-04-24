package assignment2;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
				
		/* Ask user to enter a figure, 
		 * then draw a square by using that figure.  
		 * Similar to the given square
		 * 		*************
		 * 		*			*
		 * 		*			*
		 * 		*************
		 */
		Scanner figure = new Scanner(System.in);
		System.out.println("Please enter a figure");
		String fg = figure.next();
		
		System.out.println(fg+fg+fg+fg+fg+fg+fg+fg+fg+fg);
		System.out.println(fg+"        "+fg);
		System.out.println(fg+"        "+fg);
		System.out.println(fg+fg+fg+fg+fg+fg+fg+fg+fg+fg);
		
	}

}
