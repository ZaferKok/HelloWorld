package day08_review_switch;

import java.util.Scanner;

public class SwitchQuestion4 {

	public static void main(String[] args) {
		/*Write a Java program user will choose 
		 * answer among A, B, C, or D.
		 If the answer is true, output will be “True.” 
		 If the answer is false, output will be“False”. 
		 Correct answer is ‘C’ for the multiple option question.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter answer A,B,C or D");
		char x = scan.next().charAt(0);
		
		switch (x) {
		case 'A':
			System.out.println("False");
			break;
		case 'B':
			System.out.println("False");
			break;
		case 'C':
			System.out.println("True");
		case 'D':
			break;
		default :
			System.out.println("Enter valid answer");
		}
	}
}
