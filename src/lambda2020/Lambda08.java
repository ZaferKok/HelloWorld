
package lambda2020;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda08 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
        list.add("Ali");
        list.add("Mark");
        list.add("Jackson");
        list.add("Amanda");
        list.add("Chris");
        list.add("Tucker");
        
       System.out.print("| ");
        list.stream()
        	.sorted(Comparator.naturalOrder())
        	.map(t->t+" | ")
        	.forEach(System.out::print);

        System.out.println();
        System.out.print("| ");
        list.stream()
    		.sorted(Comparator.reverseOrder())
    		.map(t->t+" | ")
    		.forEach(System.out::print);
        
        System.out.println();
        System.out.print("| ");
        list.stream()
			.sorted(Comparator.comparing(t->t.length()))
			.map(t->t+" | ")
			.forEach(System.out::print);
	
        System.out.println();
        System.out.print("| ");
        list.stream()
			.sorted(Comparator.comparing(t->t.charAt(t.length()-1)))
			.map(t->t+" | ")
			.forEach(System.out::print);
	
        System.out.println();


        System.out.println(list.stream()
        						.sorted(Comparator.reverseOrder())
        						.collect(Collectors.toList()));
		
        
        
        
        
        
        
        
        
        
	
	}
}