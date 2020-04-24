package day08_review_switch;

import java.util.Scanner;

public class SwitchQuestion5 {

	public static void main(String[] args) {
		/*  Type java code by using switch statement.
			A school has following rules for grading system:
			1. Below 50 - C     2. 50 to 80 - B.     4. Above 80 - A
			Ask user to enter marks and print the corresponding grade.
		 */
		
		Scanner check = new Scanner(System.in);
		System.out.println("Enter your note");
		int note = check.nextInt();
			
		
	/*
		 if (note >=0 && note<50) {
			 System.out.println("Notunuz C");
		 }else if(note >=50 && note<80) {
			 System.out.println("Notunuz B");
		 }else if(note>=80 && note<=100) {
			 System.out.println("Notunuz A");
		 }else {
			 System.out.println("Type your note between 0-100");
		 }
			 
		String deg = (note >=0 && note<50) ? ("Notunuz C") : ((note >= 50 && note <80) ? ("Notunuz B") :(note >=80 && note<=100 ? ("Notunuz A") : ("Enter valid note")));
		System.out.println(deg);
	*/
		if (note >=0 && note<50) {
		note = 0;	
		}else if (note>=50 && note<80) {
		note = 50;
		}else if (note>=80 && note<=100) {
		note = 80;	
		}else {
		note = 101;
		}
				
		switch (note) {
		case 0:
 			System.out.println("Your grade is C");
			break;
		case 50:
			System.out.println("Your grade is B");
			break;
		case 80:
			System.out.println("Your grade is A");
			break;
		default:
			System.out.println("Enter valid code between 0-100");
		}
	}
}
