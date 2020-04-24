package day19_array_list;


import java.util.ArrayList;
import java.util.List;

public class AddAndSizeMethods {

	public static void main(String[] args) {
		// How to add elements into a list
		
		List<String> list1 = new ArrayList<>();
		System.out.println(list1);
		// add() without index
		list1.add("Ali");
		System.out.println(list1);
		//add() method adds the elements at the end of the list
		list1.add("Ayse");
		System.out.println(list1);
		
		list1.add("Ahmet");
		System.out.println(list1);
		// add method with index
		list1.add(1,"John");
		System.out.println(list1);
		// If you use the index more than the length of 
		//existing list, you will get 
		//IndexOutOfBoundsException
	
	
	}
	

}
