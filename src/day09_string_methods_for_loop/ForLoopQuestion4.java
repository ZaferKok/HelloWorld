package day09_string_methods_for_loop;

public class ForLoopQuestion4 {

	public static void main(String[] args) {
		/*Type a program to find 
		 * the positive integers which are not 
		 * divisible by 3 and less than 100, and 
		 * print them on the console.

		 */
		for (int i=1; i<=100; i++) {
			if (i%3 != 0)
				System.out.println(i);
		}
	}

}
