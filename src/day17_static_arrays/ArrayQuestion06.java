package day17_static_arrays;

import java.util.Scanner;

public class ArrayQuestion06 {

	public static void main(String[] args) {
		/*Reverse an array For example, {1,2,3} ----> {3,2,1}*/
	
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the length of the array");
	int length = scan.nextInt();
	int arr[] = new int[length]; 
	System.out.println("Enter the integers of the array");
	for (int i = 0; i<arr.length; i++) {
		arr[i] = scan.nextInt();
	}
	
	for (int i = 0; i<length; i++) {
		System.out.print(arr[length-1-i] + " ");
		
		/*
		 * int reverseArray[] = new int[length];
		 * for (int i = 0; i<length; i++)
		 * 		reverseArray[i] = arr[length-1-i];
		 * 		System.out.print(reverseArray[i] + " ");
		 */
	}

	}

}
