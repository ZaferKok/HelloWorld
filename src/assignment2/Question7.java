package assignment2;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		/* Ask user to enter weekly salary and the amount to save,
		 *  then calculate how many
		months he needs to save
		*/

		Scanner scan =new Scanner(System.in);
		System.out.println("Enter your weekly salary");
		float salary = scan.nextFloat();
		System.out.println("Enter your need of amount");
		int amount = scan.nextInt();
		
		float month = (amount/salary)/4;
		System.out.println("You need to work " + month + "months");
		
		
	}

}
/*}
import java.util.Scanner;
public class Question7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter weekly salary");
        int salary=scan.nextInt();
        System.out.println("Enter amount to save");
        int amountToSave=scan.nextInt();
    
        System.out.println(amountToSave/(salary*4) + " months to save");
    }
}
*/