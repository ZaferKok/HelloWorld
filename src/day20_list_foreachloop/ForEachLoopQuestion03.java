package day20_list_foreachloop;

public class ForEachLoopQuestion03 {

	public static void main(String[] args) {
		/* Write a Java program to find 
		 * the common elements between two 
		 * arrays (string values).
		 */
		
		String arr1[] = {"Ali","Veli","Can"};
		String arr2[] = {"Ahmet","Can","Mehmet"};
		
		for (String s : arr1) {
			for (String c: arr2) {
				if (c.equals(s)) {
					System.out.println(s + " ");
				}
			}
		}
	}
}
