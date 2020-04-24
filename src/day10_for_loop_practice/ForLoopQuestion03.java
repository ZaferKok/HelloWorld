package day10_for_loop_practice;

public class ForLoopQuestion03 {

	public static void main(String[] args) {
		/*Create a for statement using a range of numbers from 1 to 120 inclusive
		 * Break out of the loop once you find 7 numbers that can be divided with both by 4 and 6 
		 * Print the sum of this 7 numbers on the console
		 * */

		int count = 1;
		int sum = 0;
		for(int i=1; i<=120; i++) {
			if(i%4==0 && i%6==0 && count<=7) {
				sum = sum + i;
				count++;
			}
		}
		System.out.println(sum);
	}
}
