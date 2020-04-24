package day06_nested_if;

import java.util.Scanner;

public class NestedIfQuestion1 {

	public static void main(String[] args) {

		/*If the gender is male and the age is less than 20 print on the console “Boy”
		 * If the gender is male and the age is more than or equal to 20 print on the console “Man”
		 * If the gender is female and the age is less than 20 print on the console “Girl”
		 * If the gender is female and the age is more than or equal to 20 print on the console “Woman”
		 * */
		/*Scanner scan = new Scanner(System.in);
		System.out.println("Enter gender");
		String gender = scan.next();
		System.out.println("Enter age");
		int age = scan.nextInt();
			
	}

}*/
//SOLUTION

Scanner scan = new Scanner(System.in);
        System.out.println("Enter gender");
        String gender = scan.next();
        System.out.println("Enter age");
        int age = scan.nextInt();
        
        if(gender.equalsIgnoreCase("male")) {
            
            if(age<20) {
                System.out.println("You are a boy");
            }else {
                System.out.println("You are a man");
            }
            
        }else {
            
            if(age<20) {
                System.out.println("You are a girl");
            }else {
                System.out.println("You are a woman");
            }
}}}