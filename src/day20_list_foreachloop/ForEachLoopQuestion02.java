package day20_list_foreachloop;

public class ForEachLoopQuestion02 {

	public static void main(String[] args) {
		/*Create an integer array find the sum of all 
		 * elements by using for-each loop
		 * and print the sum on the console.*/

		int arr[] = {3,5,7,2,1,9,12};
		
		int sum= 0;
		
		for (int i : arr) { // i'ye array deki index içeriklerini aktarıyor. index değil!!!
			sum = sum + i;
		}System.out.println("The sum is : " + sum);
		
	}

}
