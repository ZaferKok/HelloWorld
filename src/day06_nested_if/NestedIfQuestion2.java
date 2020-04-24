package day06_nested_if;

import java.util.Scanner;

public class NestedIfQuestion2 {

	public static void main(String[] args) {
		/*Type java code by using nested if statement,
if a number is an integer and divisible by 3, output will be “Perfect number.”
If the number is an integer and not divisible by 3, output will be “Good number.”
If the number is not an integer and less than 10, output will be “Bad number.”
If the number is not an integer and greater than or equal to 10, output will be “Ordinary number.”
*/
		//BU SORU TAMAMLANMADI!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer number");
		Integer num = scan.nextInt();
		
		System.out.println(num instanceof Integer); 
		//"Instanceof" method is used to check data type
		// çünkü küsüratlı bir rakam girilmiş olabilir.
		// eğer doğru ise TRUE mesajı çıkar
		// True yazdırmaya gerek yok.
		
		if(num instanceof Integer) {
			if(num % 3 == 0) {
				System.out.println("Perfect number");
			}else {
				System.out.println("Good number");
			}
		}else {
			if (num < 10) {
					System.out.println("Bad number");
				}else {
					System.out.println("Ordinary  number");
				}
			}
			
		}
		
	}

