package day12_while_loop_do_while_loop;

import java.util.Scanner;

public class MentorSessionQuestion {

	public static void main(String[] args) {
		/*
         * Ask users to enter a string. Check whether it is a palindrome or not.
         * Example: AC RIFATA FIRCA, FIRAR EDER ARIF
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter some words.");
        String str = input.nextLine();
        
        String str2 = str.replaceAll("\\s", "");
        
        boolean result = true;
        
       /* for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(j);
            
            if (ch1 != ch2) {
                result = false;
            } 
        }*/
        if (result) {
            System.out.println("This is a palindrome.");
        } else {
            System.out.println("This is not a palindrome.");
        }
    }
}
