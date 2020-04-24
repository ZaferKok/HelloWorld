package day07_review_ternary;

import java.util.Scanner;

public class ReviewQuestion3 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a letter");
		char letter = scan.next().charAt(0);
		
		if (letter >= 'A' && letter<= 'Z') {
			if (letter < 'F') {
				System.out.println("Big before F");
			}else {
				System.out.println("Big after F");
			}
		}if (letter >= 'a' && letter <= 'z') {
			if (letter < 'h') {
				System.out.println("Small before h");
			}else {
				System.out.println("Small after h");
			}
		}else {
			System.out.println("You need to enter a letter");
		}
		
	}

}
