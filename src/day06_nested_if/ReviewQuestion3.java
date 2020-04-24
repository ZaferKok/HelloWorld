package day06_nested_if;

import java.util.Scanner;

public class ReviewQuestion3 {

	public static void main(String[] args) {
/*Ask user to enter password, if the password is okay for 
 the following conditions output will be
“Your password is created successfully.” 
If the password is not okay for any of the 
following conditions
Output will be “Enter a new password according to 
the give conditions”
1.First letter must be upper case
2.Last letter must be lower case
3.Password must contain 6 characters*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the password");
		String password = scan.nextLine();
		
		char first = password.charAt(0);
		char last = password.charAt(5);
		
		if(password.length() ==6  && first>='A' && first<='Z' 
			&& last>='a' && last<='z') {
			
			System.out.println("good");
			
		}else {
			System.out.println("Your new password is not appropriate");
		}
		
	}

}
/*Scanner scan = new Scanner(System.in);
System.out.println(“Enter password”);
String password = scan.nextLine();
if(password.length() == 6 && (password.charAt(5)>=‘a’ && password.charAt(5)<=‘z’) 
		&& (password.charAt(0)>=‘A’ && password.charAt(0)<=‘Z’)) {
	System.out.println(“Password is created successfully”);
}else {
	System.out.println(“Enter a new password according to the given conditions”);
}*/