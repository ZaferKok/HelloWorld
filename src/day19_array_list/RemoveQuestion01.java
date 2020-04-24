package day19_array_list;

import java.util.ArrayList;
import java.util.List;

public class RemoveQuestion01 {

	public static void main(String[] args) {
		// Remove first two elements from a list
		
		List<String> list1 = new ArrayList<>();
		list1.add("Ali");
		list1.add("Veli");
		list1.add("Can");
		
		System.out.println(list1); // [Ali, Veli, Can]
		
		System.out.println(list1.remove(0)); //Ali
		System.out.println(list1); //[Veli, Can]
		
		System.out.println(list1.remove(0));// Veli
		System.out.println(list1); //[Can]
	}

}
