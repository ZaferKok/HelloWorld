package day18_array_methods_multi_diamensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortQuestion01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length an array numbers");
		int length = scan.nextInt();
		int[] arr = new int[length];
		
		System.out.println("Enter integers of the array");
		for (int i=0; i<length; i++) {
			arr[i] = scan.nextInt();
			
		} 
		
		for (int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println();
		Arrays.sort(arr);

		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " "); //ascending order
		}
			System.out.println();
		for (int i=0; i<arr.length; i++)
			System.out.print(arr[length-1-i] + " "); // descending order
	
	}
}
