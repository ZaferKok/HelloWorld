package day30_collections;

import java.util.HashMap;
import java.util.Iterator;

public class HashMap02 {

	public static void main(String[] args) {
		// Create a HashMap. All maps use <Key, Value>
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "A");
		hashMap.put(3, "C");
		hashMap.put(2, "B");
		hashMap.put(5, "E");
		System.out.println(hashMap); // {1=A, 2=B, 3=C, 5=E}

		Iterator itr = hashMap.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	
	}

}
