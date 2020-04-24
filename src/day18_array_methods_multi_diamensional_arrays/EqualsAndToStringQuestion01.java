package day18_array_methods_multi_diamensional_arrays;

import java.util.Arrays;

public class EqualsAndToStringQuestion01 {

	public static void main(String[] args) {
		/*Create two arrays which have same elements in different order.
Use equals() to compare them before using sort() and after using sort()
Print the elements of the arrays on the console by using toString()*/ 


		
		String arr3[] = {"A","B","C"};
		String arr4[] = {"A","C","B"};
		System.out.println(Arrays.equals(arr3, arr4));
		Arrays.sort(arr3);
		Arrays.sort(arr4);
		System.out.println(Arrays.equals(arr3,arr4));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		
		int arr1[] = {22,33,44,55,66,11};
		int arr2[] = {20,30,40,50,60,10};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(Arrays.equals(arr1,arr2));
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}

}
