package day13_Review_StringMethods_MethodCeration;

import java.util.Scanner;

public class StringMethods00 {

	public static void main(String[] args) {
		/*Task: Ask user to enter his first name.
Make the first and the last letters “*”    */

		Scanner scan = new Scanner(System.in);  //!!!!!!!!!!!!!Strings are immutable!!!!!!!!!!!!
		System.out.println("Enter  your first name"); //What is garbage Collector
		String name = scan.next();
		
		int i = name.length();
		
		
		System.out.print(name.substring(0, 1).replaceAll("\\w", "*"));
		System.out.print(name.substring(1, i-1));
		System.out.print(name.substring(i-1).replaceAll("\\w", "*"));
		
		
		
		//String newName = name.replace(name.substring(0, 1), "*"); //We created new String. we didn't change it.
		//String newName2 = name.substring(1, i-1);
		//String newName3 = name.replace(name.substring(i-1), "*");
		//System.out.print(newName + newName2 + newName3);	
		//System.out.println(newName);
		
		
		
	}

}
/*
 * Task: Ask user to enter his first name.
 * Make the first and the last letters "*"
 *

Scanner scan = new Scanner(System.in);
System.out.println("Enter your first name");
String name = scan.next();

String initial = name.substring(0,1).replaceAll("\\w", "*");
String restOfTheName = name.substring(1);
String changedName = initial + restOfTheName;

System.out.println(name);  //Ali 
System.out.println(changedName); // *li    
*/