package assignment4;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		/*Ask user to enter a three digits integer. 
		 * If the first and last digits of the number 
		 * are same out put will be “Mirror number.” If all
digits are same, output will be “Perfect number.” 
Otherwise, output will be “Ordinary number.” 
olve by using if - else if()
statement.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer 3 digits");
		int z = scan.nextInt(); //We can solve the problem with String also.Use charAt()

		int a = z/100;
		int b = (z/10)%10;
		int c = z%10;
	
	if (z>99 && z<1000)	{
		if (a==b && b==c) {
			System.out.println("Perfect number");
		}else if (a==c) {
			System.out.println("Mirror number");
		}else {
			System.out.println("Ordinary number");
		}
	}else {
		System.out.println("Enter 3 digits please");
	}
}

}
