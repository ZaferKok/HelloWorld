package day20_list_foreachloop;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoopQuestion04 {

	public static void main(String[] args) {
		/*
		 * Create a list find the product of 
		 * all elements by using for-each loop
		 * and print the product on the console
		 */

		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(10);
		
		int product = 1;
		
		for (int w : list) {
			product = product * w;
		}System.out.println(product);
	}
}
