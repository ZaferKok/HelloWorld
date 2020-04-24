package day05_if_logicals;

import java.util.Scanner;

public class WarmUp4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter four digits number");
		
		int in1 = scan.nextInt ();
		
		int first = in1 / 1000;
		int last = in1 % 10;
		
		System.out.println("Total of first and last digists is :" + (first+last));
		
				
	}

}
