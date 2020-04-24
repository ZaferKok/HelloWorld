package lambda2020;

import java.util.ArrayList;
import java.util.List;

public class Lambda06 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(13);
		list.add(10);
		list.add(14);
		list.add(5);
		list.add(7);
		list.add(3);
		list.add(5);
		list.add(13);
		list.add(16);
		
		// Use Functional Code to find the max element Type 3
		System.out.println(list.stream()
							   .reduce(0,Integer::max)); // Using "0" is risk for negative numbers. The starting point make the result false
		System.out.println(list.stream()
							   .reduce(Integer.MIN_VALUE,Integer::max)); // This method is safer.
		
		// Use Functional Code to find the max element Type 1
		System.out.println(list.stream()
							   .reduce(Integer.MIN_VALUE,(a,b)-> a>=b ? a : b)); // Ternay method used in the code
	
		System.out.println(list.stream()
							   .reduce(Integer.MAX_VALUE,Integer::min)); // Type 3
	
		System.out.println(list.stream()
							   .reduce(Integer.MAX_VALUE,(a,b)-> a<=b ? a : b)); // Type 1
	
	
	
	}

}
