package assignment2;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		
		/*
		 * Write Java program to allow the user to 
		 * input two integer values and then  
		 * the program prints the results of adding, 
		 * subtracting, multiplying, 
		 * and  dividing among the two values
		 */
		
		
		
		Scanner anten = new Scanner (System.in);
		System.out.println("Please enter two integer numbers");
		
		int num1 = anten.nextInt ();
		int num2 = anten.nextInt ();
		
		System.out.println("Adding : " + (num1 + num2));
		System.out.println("Subtracting : " + (num1 - num2));
		System.out.println("Multiplying : " + (num1 * num2));
		System.out.println("Dividing : " + (num1/num2));
	}

}
