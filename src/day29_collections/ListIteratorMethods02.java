package day29_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods02 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);
		
		ListIterator<String> litr = list.listIterator();

		//To update elements on by one we use set()
		while(litr.hasNext()) {
			Object element = litr.next();
			litr.set(element + "W");
		}
		System.out.println(list);
		
		
		// ListIterator has add() method to add elements to the list
		litr.add("D");
		litr.add("E");
		System.out.println(list); // [D,E,A,B,C]
	}

}
