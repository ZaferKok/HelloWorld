package day12_while_loop_do_while_loop;

import java.util.Scanner;

public class WhileLoopQuestion03 {

	public static void main(String[] args) {
		/*Type java code by using while loop, 
     Write a program that prompts the user to input a positive integer. 
     It should then print factorial of that number.*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an Iteger");
		int num = scan.nextInt();
		
		int i = 1;
		int f = 1;
		
		while (i<=num) {
			f = f*i;
			i++;
		} System.out.println("factorial : " + f);
	}
}
