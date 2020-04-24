package day19_array_list;

import java.util.ArrayList;
import java.util.List;

public class ClearMethod {

	public static void main(String[] args) {
		
		// clear() is used to delete all element inside a list
		
		List<String> list1 = new ArrayList<>();
        list1.add("Ali");
        list1.add("Veli");
        list1.add("Can");
        
        System.out.println("Before clearing " + list1); //[Ali, Veli, Can]
		
        list1.clear(); // Deleted all.
		//System.out.println(list1.clear());
		//If the return type is "void" do not put it inside the System.out.print()
        //If you do it you will get Compile time Error
        
        
		System.out.println("After clearing " + list1);
		
	}

}
