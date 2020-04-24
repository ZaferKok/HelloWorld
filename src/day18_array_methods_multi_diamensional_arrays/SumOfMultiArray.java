package day18_array_methods_multi_diamensional_arrays;

public class SumOfMultiArray {

	public static void main(String[] args) {
		/*
		 * 1) Find the sum of all elements in the multi
		 *  dimensional array { {1,2,3}, {4,5,6} }
		 */
		int arr[][]= {{1,2,3},{4,5,6}};
		
		int total = 0;
		for (int i = 0; i<arr.length; i++) {
			int sum = 0;
			for (int j = 0; j<arr[i].length; j++) {
				sum +=arr[i][j];
			}System.out.println("ara"+sum);
			total += sum;
		}System.out.println(total);
	}
}
