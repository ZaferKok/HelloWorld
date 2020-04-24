package assignment3;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		/*Ask user to enter 3 integers. If user entered them in ascending order, output will be
“Good Job, the numbers are in ascending order.” If user entered them in descending order, output will be
“Good Job, the numbers are in descending order.” Otherwise, output will be “Put them in order”*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter integer in ascending or descending order");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
				
		if (c>b && b>a) {
			System.out.println("Good Job, the numbers are in ascending order");
		}else if (a>b && b>c) {
			System.out.println("Good Job, the numbers are in descending order");
		}else {
			System.out.println("Put them in order");
		}
		
	}

}
