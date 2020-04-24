package day12_while_loop_do_while_loop;

import java.util.Scanner;

public class WhileLoopQuestion05 {

	public static void main(String[] args) {
		/*Get number from user
		 Type java code by using while loop, 
     Write a program that prompts the user to input an integer. 
     It should then find sum of the digits of that number.*/
		//1234
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an Iteger");
		int num = scan.nextInt();
		
		int sum = 0;
		
				
		while (0<num) {
			
			int last = num%10;
			sum = sum + last;
			num = num/10;	
		
		} System.out.println(sum);
	
	}

}
