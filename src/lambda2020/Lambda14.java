package lambda2020;

import java.math.BigInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lambda14 {

	public static void main(String[] args) {
		
		for(int i = 0; i<10; i++) {
			System.out.print(i + " ");
		}
		System.out.println("===");
		IntStream.range(1, 11).forEach(System.out::print); // For ranege(a, b) ==> a is inclusive, b is exclusive
		System.out.println("===");
		IntStream.rangeClosed(0, 10).forEach(System.out::print); // For ranegeClosed(a, b) ==> a is inclusive, b is inclusive
		System.out.println();
		// Print first 5 odd integers on the console by using For loop
		for (int i=0; i<10; i++) {
			if(i%2!=0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		// Print first 5 add integers on the console by using Functional Programing
		IntStream.iterate(1, t->t+2).limit(5).forEach(System.out::print);
		
		System.out.println();
		System.out.println(IntStream.iterate(2, t->t+2)
									.limit(10)
									.sum());
		
		IntStream.iterate(2, t->t*2).limit(5).forEach(System.out::print);

		System.out.println(); // Find the average valiu ou the first 5 powers of 2
		System.out.println(IntStream.iterate(2, t->t*2).limit(5).average());
		
		// Print first 10 counting numbers on the console as a list
		System.out.println(IntStream.range(1,11).boxed().collect(Collectors.toList())); //[1,2,3,4,5,6,7,8,9,10]
		
		//Calculate 5 factorial ==> 5! = 5 x 4 x 3 x 2 x 1 = 120
		System.out.println(IntStream.rangeClosed(1, 33).reduce(1,(a,b) -> a*b)); // after 33 it is giving error. it is too big.
		
		// Calculate 50 factorial ==> 50x49x48x47x46x.....3x2x1 = ?
		System.out.println(IntStream.rangeClosed(1, 50).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::multiply));
		//30414093201713378043612608166064768844377641568960512000000000000

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
