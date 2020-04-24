package day19_array_list;

import java.util.Arrays;

public class ArrayQuestion01 {

	public static void main(String[] args) {
		/*Write a Java program to remove a specific element from an array.
		 * Remove second element from the array
		 * 
		 */
		
		 int arr[]= {8,5,6,7,10};
		 int removedArr[]=new int[arr.length-1];
		 int removedIndex = 1;
		 int j = 0;
		 
		 for (int i = 0; i<arr.length; i++) {
			 if (i==removedIndex) {
				 continue; // If you want to skip some values in a loop use "continue" keyword.
			 }else {
				 removedArr[j] = arr[i];
				 j++;
			 }
		 }
		 System.out.println("Array before removing " + Arrays.toString(arr));
		 System.out.println("Array after removing " + Arrays.toString(removedArr));
	}
}
