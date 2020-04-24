package assignment3;

import java.util.Scanner;

public class Q19 {

	public static void main(String[] args) {
/*Ask user to enter a his/her name. If its length is more than 4 then check if its first char is uppercase letter, output will be
“Good.” If its length is less than 4 then check if its first char is lowercase letter, output will be
“Not Bad.” Otherwise, output will be “I did not like that name.”*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scan.next();
		
		char c = name.charAt(0);
		
		if(name.length()>4) {
			if(c>='A' && c<='Z') {
				System.out.println("Good");
			}else {
				System.out.println("I did not like that name");
			}
		}else if(name.length()<4) {
			if(c>='a' && c<'z') {
				System.out.println("Not Bad");
			}else {
				System.out.println("I did not like that name");
			}
		}else {
			System.out.println("I did not like that name");
		}
		
		
		
	}

}
