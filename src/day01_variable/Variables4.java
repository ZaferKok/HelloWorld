package day01_variable;

import java.util.Scanner;

public class Variables4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first side of the triangle as byte");
        byte side1 = scan.nextByte();
	
 	System.out.println("Enter the second side of the triangle as byte");
        byte side2 = scan.nextByte();

 	System.out.println("Enter the third side of the triangle as byte");
        byte side3 = scan.nextByte();

        System.out.println("The perimeter of the triangle is : " + (side1 + side2 + side3));
	}

}
