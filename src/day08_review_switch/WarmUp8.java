package day08_review_switch;

import java.util.Scanner;

public class WarmUp8 {

	public static void main(String[] args) {
		/*Ask user ta enter a number. If the number is less than 10 and greater
than or equal to 0, calculate its cube. Otherwise, calculate its square.
Cube of a = a*a*a           Square of a = a*a
*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int num = scan.nextInt();
		
		int result = num < 10 && num >=0 ? num*num*num : num*num;
		System.out.println(result);
		
		/*
		if (num < 10 && num >=0) {
			System.out.println(num*num*num);
			
		}else {
			System.out.println(num*num);
		}
		*/

	}

}
