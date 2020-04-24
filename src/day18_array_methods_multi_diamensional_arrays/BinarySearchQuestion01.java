package day18_array_methods_multi_diamensional_arrays;

import java.util.Arrays;

public class BinarySearchQuestion01 {

	public static void main(String[] args) {
		/*
		 * {3, 5, 6, 9, 5, 10}
		 * Use binarSearch() for 1, 5, 11, 14
		 */
		int arr[] = {3,5,6,9,5,10,6};
		Arrays.sort(arr); //3,5,5,6,6,9,10
		
		System.out.println(Arrays.binarySearch(arr, 1));
		System.out.println(Arrays.binarySearch(arr, 5));
		System.out.println(Arrays.binarySearch(arr, 6));
		System.out.println(Arrays.binarySearch(arr, 14));
		
		int a = Arrays.binarySearch(arr, 1);
		System.out.println(a);
	}

}
