package day19_array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List; //do not import "java.awt.List"

public class ArrayListCreation {
   
	public static void main(String[] args) {
        //ArrayList is a re-sizable Array
        
        //How to create an ArrayList
        //1st way
        ArrayList<String> list1 = new ArrayList<String>();
        
        //2nd way
        ArrayList<String> list2 = new ArrayList<>(); 
        
        //3rd way ==> Use that one if it is possible
        //ArrayList<String> list4 = new List<>(); ==> Do not put "List" on the right side
        List<String> list3 = new ArrayList<>();
        
        //To print a list on the console, just put the name inside the System.out.println()
        System.out.println(list3);
        
        
    }
}