package day13_Review_StringMethods_MethodCeration;

import java.util.Scanner;


public class WarmUp13 {
public static void main(String[] args) {
	/*Ask user to enter his first and last name 
	Make all letters of his first and last name “*”
	Print first name and last name on the console
	For example; if the name is “Ali Yilmaz”, 
	output will be “*** ******” (edited) */
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your first name");
	String name = scan.nextLine();
	System.out.println("Enter your first last name");
	String lame = scan.nextLine();
	
	String a = name.replaceAll("\\w", "*");
	System.out.print(a + " ");
	String b = lame.replaceAll("\\w", "*");
	System.out.println(b);
	}
	

}
