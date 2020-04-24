package day19_array_list;

import java.util.ArrayList;
import java.util.List;

public class RemoveMethod {

	public static void main(String[] args) {
        //remove() method removes the elements from the list
        //We have 2 types of remove methods 1)remove() without index ==> returns boolean 
        //                                  2)remove() with index ==> returns removed element
        
        List<String> list1 = new ArrayList<>();
        list1.add("Ali");
        list1.add("Veli");
        list1.add("Can");
        
        System.out.println("Before removing " + list1); //[Ali, Veli, Can]
        System.out.println(list1.remove("Veli")); //true, because "Veli" is inside the list
        System.out.println(list1.remove("Ayse")); //false, because "Ayse" is not inside the list
        System.out.println("After removing " +list1); //[Ali, Can]
        
        //To remove Ali use its index whixh is 0
        System.out.println(list1.remove(0));//Ali
        System.out.println(list1); //Can

	}
}
