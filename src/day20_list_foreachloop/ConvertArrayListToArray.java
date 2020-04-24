package day20_list_foreachloop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayListToArray {
    public static void main(String[] args) {
        
        List<String> list1 = new ArrayList<>();
        list1.add("Ali");
        list1.add("Veli");
        System.out.println("List: "+list1); // [Ali, Veli]
        
        String arr[] = list1.toArray(new String[0]); //To convert list to Array use "toArray(new String[0])"
        System.out.println("Array: " + Arrays.toString(arr)); // [Ali, Veli]
        
        //System.out.println(list1.equals(arr)); // You will get false, because list and array are 
                                                 // different objects, they are not comparable
                                                 // Unlikely argument type for equals(): 
                                                 // String[] seems to be unrelated to List<String>
    }
}