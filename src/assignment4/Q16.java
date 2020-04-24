package assignment4;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		/*Ask user to enter an integer. 
		 * If the integer is divisible by 5, 
		output will be “Divisible by 5”, Otherwise,
 		output will be “Not divisible
		By 5” Solve by using if-else if().
		Hint: If the last digit of a number 
		is 0 or 5, the number is divisible by 5
		*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		String num = scan.next(); // we can solve it by int using num%10==0 && num%10==5
		
		int a = num.length();
		
		if (num.charAt(a-1)=='0') {
			System.out.println("Divisible by 5");
		}else if (num.charAt(a-1)=='5') {
			System.out.println("Divisible by 5");
		}else {
			System.out.println("Not divisible by 5");
		}
		
	}

}
