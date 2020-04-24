package assignment5;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		/*Ask user to enter his/her last name, 
		 * then print its inverse on the console.
			(Interview Question)
			If the last name is Walker output will be reklaW
		*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
		String n = scan.nextLine();
		
		//Zafer
		//01234
		int l = n.length();
		int i;
		
		for (i=1; i<=l; i++) {
			char c = n.charAt(l-i);
			System.out.print(c);
		}
	}
}				
		//THIS IS MY SOLUTION		
		/*
		int l = n.length();
		int i;
		
		for (i=0; i<l; i++) {
			System.out.print(n.substring(l-i-1, l-i));
		}*/


/*  IMPORTANT !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
Scanner scan = new Scanner(System.in);
System.out.println("Enter a String");
String str = scan.nextLine();

String reversedStr = "";

for(int i=1; i<=str.length(); i++) {
    reversedStr = reversedStr + str.charAt(str.length()-i);
}
System.out.println(reversedStr);
*/