package day17_static_arrays;

import java.util.Scanner;

public class ArrayQuestion05 {

	public static void main(String[] args) {
		/*Get the array from user
		return the sum of all the elements.
		 */

		sum();
	}

	public static int sum () {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int length = scan.nextInt();
		
		int arr[] = new int[length];
		int sum = 0;
		System.out.println("Enter the integer elements of the array");
		for (int i = 0; i<length; i++) {
			arr[i] = scan.nextInt();
			sum = sum + arr[i];
		}System.out.println("The sum is : " + sum);
		return sum;
	}	
}
/*package day17_static_arrays;
import java.util.Scanner;
public class ArrayQuestion07 {
    public static void main(String[] args) {
         
         * Get the array from user
         * return the sum of all elements.
         
        System.out.println("The sum is:  " + sum());
    }
    
    public static int sum() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the length of the array");
        int length = scan.nextInt(); // Take the length of the array
        
        int arr[] = new int[length]; // Create the array by using the length user gave
        
        System.out.println("Enter the integer elements of the array");
        int sum = 0;
        for(int i=0; i<length; i++){
            arr[i] = scan.nextInt();//We got the values from user and assign them to the array elements
            sum = sum + arr[i]; // Sum all the array elements
        }
        return sum;
    }
}*/