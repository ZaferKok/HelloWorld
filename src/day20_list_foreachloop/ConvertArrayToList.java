package day20_list_foreachloop;

import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {

	public static void main(String[] args) {
		
		String arr[] = {"Ali", "Veli"};
		System.out.println("Array : " + Arrays.toString(arr));

		List<String> list = Arrays.asList(arr);// To convert an array to a list use "asList()"
		//"asList()" method create a list from array; but the list is not flexible in size, it is fixed size list
		System.out.println("List : " + list);
		
		list.set(0, "Can");
		System.out.println(list);
		System.out.println(Arrays.toString(arr));//It is weird you will get [Can, Veli] for the array
												 // They use the same value store in heap memory
	
		list.remove("Veli");// UnsupportedOperationException ==> You cannot use remove()
		System.out.println(list); 
	
	
	}

}
