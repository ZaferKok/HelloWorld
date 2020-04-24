package day12_while_loop_do_while_loop;

import java.util.Scanner;

public class WhileLoopQuestion02 {

	public static void main(String[] args) {
		/*Write a Java program to count the letters, 
		 * numbers and other characters of an input string.
		 * You use while-loop
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentece which contains letters and integers");
		String s = scan.nextLine();
		s = s.toLowerCase();		
		
		int l = 0;
		int n = 0;
		int o = 0;
		
		int lng = s.length();
		int i = 0;
		
		while (i<lng) {
			if (s.charAt(i)>='a' && s.charAt(i)<='z') {
				l++;
			}else if(s.charAt(i) >= '0' && s.charAt(i)<= '9' ) {
				n++;
			}else {
				o++;
			}
			i++;
		} System.out.println("letter counts : " + l);
		  System.out.println("number counts : " + n);
		  System.out.println("others number : " + o);

	}

}
