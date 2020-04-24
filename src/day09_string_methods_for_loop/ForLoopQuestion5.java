package day09_string_methods_for_loop;

public class ForLoopQuestion5 {

	public static void main(String[] args) {
		/*  Type a program to print all letters in English
		 *  alphabet on the console in the same line
		 */
		
		for (char c = 'A'; c<='Z'; c++) {
			System.out.print((c+" ").toLowerCase());
		}
	}
}
