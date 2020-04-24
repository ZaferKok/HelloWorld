package day11_review_while_loop;

public class WhileLoopQuestion2 {

	public static void main(String[] args) {
		/*Type java code by using while loop.
Write a program that types first 30 consecutive odd integers.
*/

		int i = 1;
		
		while (i<=60) {
			if (i%2 !=0) {
				System.out.print(i + " ");
			}
			
			i++;
		
		// SHORT WAY
			
			/*
			 * int i = 1;
			 * while (i<=30){
			 * System.out.print((2*i-1) + " ");   !!!!!!!!!!!!
			 * i++
			 * }
			 */
		}
		
	}

}
