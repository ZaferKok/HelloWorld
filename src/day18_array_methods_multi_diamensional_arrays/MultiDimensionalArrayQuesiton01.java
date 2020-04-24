package day18_array_methods_multi_diamensional_arrays;

import java.util.Arrays;

public class MultiDimensionalArrayQuesiton01 {

	public static void main(String[] args) {
		/*
		 * Create a multi dimensional array and print it on the console
		 */

		int arr[] [] = {{1,2},{3},{4,5,6}};
		
			
		
		//Long way to print multi dimensional array on the console
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));
		//Short way to print multi dimensional array on the console
		System.out.println(Arrays.deepToString(arr));
		
		System.out.println((arr[2][1]));
	
	}
}
