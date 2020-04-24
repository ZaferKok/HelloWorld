package day20_list_foreachloop;

import java.util.ArrayList;
import java.util.List;

public class WarmUp20 {
    public static void main(String[] args) {
        /*
         1)Create a String list whose elements are A, C, E, and F. Print it on the console.
         2)By using add() with index method, add B into the 1st index. 
         List elements should be like A, B, C, E, and F. Print it on the console.
         3)By using set() method, convert E to D. 
         List elements should be like A, B, C, D, and F. Print it on the console.
         4)By using remove() method, remove F from the list. 
         List elements should be like A, B, C, D. Print it on the console
         5)Find the size of the list and print the size on the console.          
        */
        
        //1st Step
        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("C");
        list1.add("E");
        list1.add("F");
        System.out.println(list1);
        
        //2nd Step
        list1.add(1, "B"); // [A, B, C, E, F]
        System.out.println(list1);
        
        //3rd Step
        list1.set(3, "D");
        System.out.println(list1);// [A, B, C, D, F]
        
        //4th Step
        list1.remove("F");
        System.out.println(list1);// [A, B, C, D]
        
        //5th Step
        System.out.println(list1.size()); //4
    }
}
