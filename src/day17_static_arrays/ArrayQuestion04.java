package day17_static_arrays;

import java.util.Scanner;

public class ArrayQuestion04 {

	public static void main(String[] args) {
		/* Type a program like;
		 * Ask user to enter the size of the Array
		 * Ask user to enter all elements of the Array
		 * Print all the elements which have even index
		 *  of the Array on the console */
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int length = scan.nextInt();
		String ary[] = new String[length];
		
		System.out.println("Enter the intiger elements of the array");
		for (int i=0;  i<length; i++) {
			ary[i] = scan.next();
			
		}
		for (int i = 0; i<ary.length;i++) {
			if (i%2==0) {
			System.out.print(ary[i] + " ");
			}
		}
	}

}
/*
package day17_static_arrays;

import java.util.Scanner;
public class ArrayQuestion04 {
    public static void main(String[] args) {
        
         * Type a program like;
         * Ask user to enter the size of the Array
         * Ask user to enter all elements of the Array
         * Print all the elements which have even index of the Array on the console 
         
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the length of the array");
        int length = scan.nextInt();
        String arr[] = new String[length];
        
        System.out.println("Enter the integer elements of the array");
        
        for(int i=0; i<length; i++) {
            arr[i] = scan.next();           
        }
        
        for(int i = 0; i<length; i++) {
            if(i%2==0) {
               System.out.print(arr[i] + " ");
            }
        }   
    }
}
*/