package day19_array_list;

import java.util.Arrays;
import java.util.Scanner;

public class WarmUp19 {
/*Ask user to enter long two sentences. Then type a program to count all “words” in the sentences.
For example; if user enters “Java is easy, if you study. Nothing is easy, if you do not study” output will be 14.
Hint: Use split()*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two long sentences");
		
		String s1 = scan.nextLine();
		String arr1[] = s1.split(" ");
		
		String s2 = scan.nextLine();
		String arr2[] = s2.split(" ");
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		int a1 = arr1.length;
		System.out.println(a1);
		
		int a2 = arr2.length;
		System.out.println(a2);
	}

}
