package day17_static_arrays;

public class ArrayQuestion03 {

	public static void main(String[] args) {
		/*Given an array of int, return true if 6 appears as 
		 * either the first or last element in the array. 
		 * The array will be length 1 or more.*/
		
		System.out.println(isFirstLast6());
		
	}		
			
		public static boolean isFirstLast6() {
			
			int ary[] = {1,2,3,4,5,6};
			boolean flag = false;
			
			if (ary[0]==6 || ary[ary.length-1]==6) {
				flag = true;
			}
			return flag;
		}

}
