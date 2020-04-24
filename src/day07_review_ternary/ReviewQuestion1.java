package day07_review_ternary;

import java.util.Scanner;

public class ReviewQuestion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int num = scan.nextInt();
		
		if (num < 10) {
			System.out.println(num*num);
		}else if (num > 10) {
			System.out.println(num*2);
		}else {
			System.out.println(num);
		}
	}

}
