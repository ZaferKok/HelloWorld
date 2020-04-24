package day21_passby_date_accessmodifiers;

import java.util.Arrays;

public class Varargs01 {

	public static void main(String[] args) {
		/*
		 * Create a method which has 3 parameters outside the main method
		 * make a parameter as varargs
		 * call the method from main method in different arguments
		 * 
		 */

		walk(2,3,4,5,6,7); 
		walk(12,2);// it is not necessary to enter a value for varargs
		
	}

	public static void walk(int a, int b, int...nums) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(Arrays.toString(nums));
		
	}
	
	
}
