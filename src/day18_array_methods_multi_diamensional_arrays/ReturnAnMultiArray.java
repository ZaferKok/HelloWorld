package day18_array_methods_multi_diamensional_arrays;

import java.util.Arrays;

public class ReturnAnMultiArray {

	public static void main(String[] args) {
		/*
         * 4) Find the sum of the elements in 
         * the array elements of the given multi dimensional array
         * { {1,2,3}, {4,5}, {6,7} } and return an array.
         * For example; for { {1,2,3}, {4,5}, {6,7} } 
         * output will be {6, 9, 13}
         */
		
		int arr [][] = { {1,2,3}, {4,5}, {6,7} };
		sumInTheArray(arr);
		
	}
		
	public static void sumInTheArray(int arr[][]) {
   		int arr1[] = new int[arr.length];
		
		int sum =0;
		for (int i = 0; i<arr.length; i++) {
             
             for (int j =0; j<arr[i].length; j++) {
                 sum +=arr[i][j];
                 arr1[i] = sum;
                                
             }sum = 0;
             
		}System.out.println(Arrays.toString(arr1));
}
}
