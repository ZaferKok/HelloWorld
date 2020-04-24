package assignment3;

import java.util.Scanner;

public class Q20 {

	public static void main(String[] args) {
		/*Ask user to enter his/her birth year and gender. If his/her age is less than 40 then check the gender if the gender
is male, output will be “You are not an old man.” If his/her age is more than or equal to 50 then check the gender
if the gender is female, output will be “Maybe you are grandmother.”Otherwise, output will be “You are good.”*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your birth year");
		int y = scan.nextInt();
		System.out.println("Enter your gender");
		String g = scan.next();
		
		if(g.equalsIgnoreCase("male")) {
			if((2020-y)<40) {
				System.out.println("You are not an old man.");
			}else {
				System.out.println("You are good.");
			}
		}else if (g.equalsIgnoreCase("female")) {
			if((2020-y)>50) {
				System.out.println("Maybe you are grandmother");
			}else {
				System.out.println("You are good.");
			}
		}else {
			System.out.println("You are good.");
		}
		
		
	}

}
