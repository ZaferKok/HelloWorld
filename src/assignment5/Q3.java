package assignment5;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		/*Ask user to enter his/her first name, last name, and gender and “ _ ”
		between the words. Change all “ _ ” to “ / ” and all letters to “ * ”
		Output should be like: ****-*****-****
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name, last name and gender with '_' between the words");
		String p = scan.nextLine();
		
		// ZAFER_KOK_MALE
		
		int fi = p.indexOf("_");
		int li = p.lastIndexOf("_");
		int ln = p.length();
		
		System.out.println(p.substring(0, fi).replaceAll("\\w", "*")
				+ p.substring(fi, fi+1).replaceAll("_", "/")
				+ p.substring(fi+1, li).replaceAll("\\w", "*")
				+ p.substring(li, li+1).replaceAll("_", "/")
				+ p.substring(li+1).replaceAll("\\w", "*"));
		
	}

}
