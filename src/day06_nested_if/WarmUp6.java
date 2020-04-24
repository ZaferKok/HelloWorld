package day06_nested_if;

import java.util.Scanner;

public class WarmUp6 {

	public static void main(String[] args) {

		/*Ask user to enter annual salary, if the salary is more than or equal
		to $80.000 output will be “I accept the offer”, if the salary is between
		$60.000 and $80.000 out put will be “I negotiate to increase”,
		otherwise output will be “I do not accept the offer.”
		*/
		
		
		
		Scanner scan = new Scanner(System.in);
			System.out.println("Please enter annual salary");
		int salary = scan.nextInt();
		
		if(salary>=80000) {
			System.out.println("I accept the offer");
		}else if(salary>=60000 && salary<=80000) { // no need here 80000. it also work.
			System.out.println("I negotiate to increase");
		}else {
			System.out.println("I do not accept the offer");
		}
				
	}

}
// java always work from top to down. if you enter your formula two times of the number
// for example >=80000, it will check the first formula then goes to the next one