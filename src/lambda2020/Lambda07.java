package lambda2020;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda07 {

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

		list.stream()
			.sorted()
			.forEach(System.out::println); 			System.out.println("===");

		list.stream()
			.sorted(Comparator.naturalOrder())
			.forEach(System.out::println);			System.out.println("===");

		list.stream()
			.sorted(Comparator.reverseOrder())
			.forEach(System.out::println);			System.out.println("===");

		list.stream()
			.distinct()
			.forEach(System.out::println);			System.out.println("===");

		list.stream()
		 	.distinct()
			.sorted(Comparator.reverseOrder())
		 	.forEach(System.out::println);			System.out.println("===");

		
		
		
		
		
		
	}
}