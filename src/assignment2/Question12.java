package assignment2;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		/*Ask user to enter a 4 digit number, then type a program to print on the console its
inverse. Like if user enters 1234, you should see on the console 4321
*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 4 digit number");
		
		int num = scan.nextInt();
		
		int first = num / 1000;
		int second = (num /100) % 10;
		int third = (num % 100) / 10;
		int fourth = num % 10;
		
		System.out.println("The number you enter : " + num);
		System.out.println("The inverse of the number is : " + 
		fourth + third + second + first);
		

	}

}
