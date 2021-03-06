package lambda2020;

import java.util.ArrayList;
import java.util.List;

public class Lambda04 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
        list.add("Ali");
        list.add("Mark");
        list.add("Jackson");
        list.add("Amanda");
        list.add("Chris");
        list.add("Tucker");
        
        // Use Functional Code
        // Get the elements whose lengths are more 
        // than 5 and print their lengths on the console
        list.stream()
        	.filter(t->t.length()>5)
        	.forEach(System.out::print);
        
        list.stream()
    	.filter(t->t.length()>5)
    	.forEach(System.out::print);
        
	}

}
