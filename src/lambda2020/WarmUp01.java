package lambda2020;

import java.util.ArrayList;
import java.util.List;

public class WarmUp01 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
        list.add("Ali");
        list.add("Mark");
        list.add("Jackson");
        list.add("Amanda");
        list.add("Chris");
        list.add("Tucker");
        
        // Print square of the length of the elements 
        // whose length is less than 6 and contains the letter "r"
        // Hint:You can use filter() more than once

        list.stream()
        	.filter(t->t.length()<6)
        	.filter(t->t.contains("r"))
        	.map(t->t.length()*t.length() + " ")
        	.forEach(System.out::print);
        
        list.stream() // same but not recommended
    		.filter(t->t.length()<6 && t.contains("r"))
    		.map(t->t.length()*t.length() + " ")
    		.forEach(System.out::print);
	}

}
