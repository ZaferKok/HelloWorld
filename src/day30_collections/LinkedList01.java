package day30_collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList01 {

	public static void main(String[] args) {
		// Create a linked list
		LinkedList<String> list = new LinkedList<String>();
		
		// To add elements
		list.add("Mark");
		list.add("Amanda");
		list.add("John");
		list.add("Ann");
		list.add("Pamela");
		System.out.println(list);
		
		// To remove first element you can use remove(0) or removeFirst()
		list.removeFirst();
		System.out.println(list); // [Amanda, John, Ann, Pamela]
		
		// To remove last element
		list.removeLast();
		System.out.println(list); // [Amanda, John, Ann]
		
		// To remove any element use index with remove method
		list.remove(1);
		System.out.println(list); // [Amanda, Ann]
		
		// To add an element to beginning of the linked list
		list.addFirst("Ali");
		System.out.println(list); // [Ali, Amanda, Ann]
		
		// To add an element to the last of the linked list
		list.addLast("Can");
		System.out.println(list); // [Ali, Amanda, Ann, Can]
		
		// To add an element to a specific index
		list.add(2, "Walter");
		System.out.println(list); // [Ali, Amanda, Walter, Ann, Can]
	
		// To use "ITERATOR" for link list
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + "-");
		}
		
		// To copy a list to another list
		LinkedList<String> copiedList = new LinkedList<String>();
		copiedList.addAll(list);
		System.out.println(copiedList);
	
		// To copy a list after a specific element [A,B,C] [X,Y] ==> [A,B,X,Y,C] 
		LinkedList<String> smallList = new LinkedList<String>();
		smallList.add("X");
		smallList.add("Y");
		System.out.println(smallList); // [X,Y]
		copiedList.addAll(2, smallList);
		System.out.println(copiedList);
		
		// To check if an element is inside the linked list
		System.out.println(copiedList.contains("Ann")); 		// true
		System.out.println(copiedList.contains("Kemal")); 		//false
		
		// To remove all elements inside the linked list
		smallList.clear(); // return void
		System.out.println(smallList); // []
		
	
	
	}

}
