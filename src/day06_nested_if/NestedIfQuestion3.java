package day06_nested_if;

import java.util.Scanner;

public class NestedIfQuestion3 {

	public static void main(String[] args) {
/*Type java code by using nested if() statement.
Ask user to enter a password which has 4 characters or 3 characters.
Write a program to check if a password is valid or not according to the given conditions.
If the conditions are okay output will be “Password is valid”, otherwise output will be
“Re enter a password.”
         1.If the password has 4 characters, its third character must be uppercase.
         2.If the password has 3 characters, its third character must be lowercase.
	*/
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter 4 or 3 digits password");
	String password = scan.next();
	
	if(password.length()==4) {
		if (password.charAt(2)>='A' && password.charAt(2)<='Z') {
			System.out.println("Password is valid");
		}else {
			System.out.println("Re enter a password");
		}
	
	}else if(password.length()==3){
		if (password.charAt(2)>='a' && password.charAt(2)<='z') {
			System.out.println("Password is valid");
		}else {
			System.out.println("Re enter password");
		}
	}else {
		System.out.println("Enter 4 or 3 charactares password");
		}
	}
}


