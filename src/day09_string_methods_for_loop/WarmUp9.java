package day09_string_methods_for_loop;

import java.util.Scanner;

public class WarmUp9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter U, S or A");
		String str = scan.next();
		char a = str.charAt(0);
	
		
		switch (a) {
		case 'U':
			System.out.println("United");
			break;
		case 'S':
			System.out.println("States");
			break;
		case 'A':
			System.out.println("America");
			break;
		default:
			System.out.println("Enter U, S, A only");
		}
	}
}
