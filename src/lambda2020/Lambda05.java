package lambda2020;

import java.util.ArrayList;
import java.util.List;

public class Lambda05 {

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
		System.out.println(sumOfElements(list)); // with Type 2 result
		
		
		System.out.println(list.stream()		 // with Type 3 result
							   .reduce(0,Integer::sum));
		
		System.out.println(list.stream()		 // with Type 1 result
							   .reduce(0, (a,b)->a+b));
	
		// Find the multiplication of the elements less than 11. Use Type 2
		System.out.println(list.stream()
							   .filter(t->t<11)
							   .reduce(1, Lambda05::multiplication)); // This is made by created method which we created
	
		// Find the multiplication of the elements less than 11. Use Type 3
		System.out.println(list.stream()
							   .filter(t->t<11)
							   .reduce(1, Math::multiplyExact)); // This is made by using Java method
	
		// Find the multiplication of the elements less than 11. Use Type 1
		System.out.println(list.stream()
							   .filter(t->t<7)
							   .reduce(1, (a,b)->a*b));
	}

	// Use Functional Code
	// Find the sum of all elements by using Type2
	public static int sum (int a, int b) {
		return a+b;
	}
	public static int sumOfElements(List<Integer> list) {
		return list.stream()
				   .reduce(0, Lambda05::sum); // You will get a number which is sum of all elements	
	}
	public static int multiplication(int a, int b) {
		return a*b; 
	
}
}