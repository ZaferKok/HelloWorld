package day18_array_methods_multi_diamensional_arrays;

public class SumOfMultiMultiArray {

	public static void main(String[] args) {
		/*
		 * 3) Find the sum of the elements whose indexes 
		 * are same in the given two multi dimensional arrays
		 * arr1 = { {1,2}, {3,4,5}, {6} } and 
		 * arr2 = { {7,8,9}, {10,11}, {12} }
		 */
		int arr1[][]={ {1,2}, {3,4,5}, {6} };
		int arr2[][]= { {7,8,9}, {10,11}, {12} };
		
		int allTotal= 0;
		int total1=0;
		int total2=0;
		
		for (int i = 0; i<arr1.length; i++) {
			int sum =0;
			for(int j = 0; j<arr1[i].length; j++) {
				sum+=arr1[i][j];
				//System.out.print(sum+"-");
			}total1 +=sum;
		}System.out.println(total1);
		
		for (int i = 0; i<arr2.length; i++) {
			int sum =0;
			for(int j = 0; j<arr2[i].length; j++) {
				sum+=arr2[i][j];
				//System.out.print(sum+"-");
			}total2 +=sum;
		}System.out.println(total2);
		
		allTotal =total1+total2;
		System.out.println(allTotal);
	}
	
}
