package lambda2020;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda11 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
        list.add("Ali");
        list.add("Mark");
        list.add("Jackson");
        list.add("Amanda");
        list.add("Chris");
        list.add("Tucker");
        
       // Print all elements on the console in uppercase by using Functional Programming
        
        // Type 1
        System.out.print("| ");
        list.stream()
        	.map(t->t.toUpperCase() + " | ")
        	.forEach(System.out::print);		System.out.println();
        
        // Type 3
        System.out.println();
        System.out.print("| ");
        list.stream()
        	.map(String::toUpperCase)
        	.map(t->t+" | ")
        	.forEach(System.out::print);
        
        
        System.out.println();
        // Print all elements on the console in uppercase by using replaceAll() Functional Programming
        list.replaceAll(String::toUpperCase);
        System.out.println(list); // [ALÝ, MARK, JACKSON, AMANDA, CHRÝS, TUCKER]
        
        list.replaceAll(t->t.toUpperCase());
        System.out.println(list);
        
        // Remove the elements whose lengths are less than 5
        list.removeIf(t->t.length()<5);
        System.out.println(list); // [JACKSON, AMANDA, CHRÝS, TUCKER]
	}

}
