package day10_for_loop_practice;

import java.util.Scanner;

public class WarmUp10 {

	public static void main(String[] args) {
		/*Ask user ta enter his/her first name, last name and Social Security Number.
Then type a program which makes
initials of the first name and the last name in uppercase,
other characters will be in lowercase.
all characters except last 4 characters of the Social Security Number ” * “.
   For example; Suleyman Alptekin *****5678
   */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name");
		String fn = scan.next();
		System.out.println("Enter your last name");
		String ln = scan.next();
		System.out.println("Enter social number");
		String num = scan.next();
		
		String strFn = fn.substring(0, 1).toUpperCase();
		String fnOthers = fn.substring(1).toLowerCase();
		System.out.println(strFn + fnOthers);
		
		String strLn = ln.substring(0, 1).toUpperCase();
		String lnOthers = ln.substring(1).toLowerCase();
		System.out.println(strLn + lnOthers);
		
		String strNum = num.substring(0, 5).replaceAll("\\d", "*");
		String strNumOthers = num.substring(5);
		System.out.println(strNum.concat(strNumOthers));
	}

}
