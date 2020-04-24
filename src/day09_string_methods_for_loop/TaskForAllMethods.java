package day09_string_methods_for_loop;

import java.util.Scanner;

public class TaskForAllMethods {

	public static void main(String[] args) {
		/* 1) Ask user to enter a password which has 
		 *   a)At least two words with space between them
		 *   b)It should have at least 9 characters in total 
		 *   c)At least one upper case, one lower case, a number, and a special character
		 *   d)At the beginning use one space, at the end use double space
		 *      Note: For every step use your password   
		//PASSWORD : " Hey Come1?  "
*/				//	  0123456789012
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Pasword according to the given rules");
		String p = scan.nextLine();
		
		
		// 2) Find the index of the initials of the words in your password
			// index of the first word is 1.
		int idx2 = p.indexOf(" ",1); // ikinci " " dan sonraki yani +1
		System.out.println(idx2 + 1);
	
		// 3) Find the last index of any character which is repeated in your password
		int idx3 = p.lastIndexOf("e");
		System.out.println(idx3);
		
		// 4) Replace * for all numbers in your password
		String str1 = p.replaceAll("\\d", "*");
		System.out.println(str1);
		
		//5) Replace ? for all non-words in your password
		String str2 = p.replaceAll("\\W","?");
		System.out.println(str2);
		
		//6) Replace // for the second character of your password
		String str3 = p.replace("H","//");
		System.out.println(str3); 
		
		//7) Print your password without any space at the beginning and at the end of the password.
		// Find the length of your password before trim and after trim.
		System.out.println("Before Trim : " + p.length());
		System.out.println("After Trim : " + p.trim().length());
	
		// 8) Print your password on the console by starting from the 4th character
		System.out.println(p.substring(3));
	
		// 9) Print the characters of your password from 2nd character to 7th character 
		System.out.println(p.substring(1, 7));
	 
		// 10)Print your password on the console like all characters in upper case
		System.out.println(p.toUpperCase());
		
		 // 11)Print your password on the console like all characters in lower case
		System.out.println(p.toLowerCase());
	
	}
}
