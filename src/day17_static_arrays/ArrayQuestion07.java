package day17_static_arrays;

import java.util.Scanner;

public class ArrayQuestion07 {

	public static void main(String[] args) {
		/*Find duplicate elements in a given array*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int length = scan.nextInt();
		int arr[] = new int[length];
		System.out.println("Enter the integer of the array");
		
		for (int i = 0; i<length; i++) {
			arr[i] = scan.nextInt();
		}
		for (int i = 0; i<length; i++)
			for (int j = i+1; j<length;  j++) {
				if (arr[i]==arr[j])
				System.out.println("This array has dublicate integer" + arr[i]);
			}
			
	}

}
