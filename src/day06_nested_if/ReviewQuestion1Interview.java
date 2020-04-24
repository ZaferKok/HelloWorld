package day06_nested_if;

import java.util.Scanner;

public class ReviewQuestion1Interview {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter 4 letters word");
		String word = scan.next();
		
		char first = word.charAt(0);
		char second = word.charAt(1);
		char third = word.charAt(2);
		char fourth = word.charAt(3);
		
				
		System.out.println(" Befor inversing : " + word);
		System.out.println("After inversign : " + fourth+third+second+first);
	}

}
