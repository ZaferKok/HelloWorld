package day29_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorAndForEachLoop {
	// Iterator is for updating List
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("X"); // Elements are added.
		list.add("Y");
		list.add("Z");
		System.out.println(list);
		
		for(String w:list) {
			w = w + "M";
			
		}System.out.println(list);
		
		
		Iterator<String> itr1 = list.iterator();
		// hasNext() returns true or false. If inside the iterator there is
		// next element it return true; or otherwise it returns false.
		while(itr1.hasNext()) {
			// next() returns the element and moves he pointer to the next element.
			Object element = itr1.next();
			System.out.print(element + " ");
		}
		
		Iterator<String> itr2 = list.iterator();
		while(itr2.hasNext()) {
			itr2.next();// If yo do not use next() before remove(), you will get IllegalStateException
			itr2.remove();
		}System.out.println(list);
	}

}
