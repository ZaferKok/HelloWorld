package assignment3;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		/* Ask user to enter 2 names together 
		 * with their birth years. Print their 
		 * names on the console from young to old.
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter one name");
		String n1 = scan.next();
		System.out.println("Enter birth year");
		int y1 = scan.nextInt();
		System.out.println("Enter second name");
		String n2 = scan.next();
		System.out.println("Enter birth year");
		int y2 = scan.nextInt();
	
		
		if(2020-y1<2020-y2) {
			System.out.println(n1+" "+n2);
		}else {
			System.out.println(n2+" "+n1);
		}
		
		
		
		
		//another solution with nested if
		
	if (y1>1900 && y2>1900 && y1<2020 && y2<2020) {
		if (y1<y2){
			System.out.println(y2 +" "+n2);
			System.out.println(y1 +" "+n1);
		}else {
			System.out.println(y1 +" "+n1);
		System.out.println(y2 +" "+n2);
		}
	}else {
		System.out.println("Enter valid birth date and name");
		}
	}
}
