package day07_review_ternary;

import java.util.Scanner;

public class ReviewQuestion2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scan.next();
		
		if (name.contains("a")) {
			System.out.println("The name has character 'a'");
		}else if (name.contains("z")) {
			System.out.println("The name has character 'z'");
		}else {
			System.out.println("The name has neither 'a' nor 'z'");
		}

	}

}
