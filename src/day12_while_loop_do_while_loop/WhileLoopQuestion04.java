package day12_while_loop_do_while_loop;

import java.util.Scanner;

public class WhileLoopQuestion04 {

	public static void main(String[] args) {
		/*Type java code by using while loop, 
Write a program to count the factors of an 
integer which is entered by user.*/

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an Iteger");
		int num = scan.nextInt();
		
		int i = 1;
	
		while (i<=num) {
						
			if (num%i==0) {
			System.out.print(i + " ");
			
			} i++; //Put the count out of IF but in the WHILE
		}
	}
}		

