package day18_array_methods_multi_diamensional_arrays;

public class FindTheLastInMultiArray {

	public static void main(String[] args) {
		/*
		 * 2) Find the product of the last elements 
		 * in the array elements of the
		 * given multi dimensional array { {1,2,3}, {4,5}, {6} }
		 */
		int arr[][]= {{1,2,3},{4,5},{6}};
		
		for (int i= 0; i<arr.length; i++) {
			int j = arr[i].length;
			System.out.println(arr[i][j-1]);
	
		}
		
	}

}
