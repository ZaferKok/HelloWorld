package day17_static_arrays;

public class ArrayQuestion01 {

	public static void main(String[] args) {
		/* {“a”, “b”, “c”, “d”}
		 * Type a program to declare and initialize the given Array
		 * Print just the second element of the array on the console
		 * Print just the last element of the array on the console
		 * Print the size of the array on the console
		 * Print all elements of the array on the console
		 */
		
		 String arrS[] = {"a", "b", "c", "d"};
		 
		 System.out.println(arrS[1]);
		 System.out.println(arrS.length-1);
		 System.out.println(arrS.length);
		 for (int i = 0; i<4; i++) {
			 System.out.print(arrS[i] + " ");
		 }
	}

}
