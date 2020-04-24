package day21_passby_date_accessmodifiers;

import java.util.Scanner;

public class AccessModifiers01 {

	private int 	numPrivate 		= 10;
	int 			numDefault 		= 11;
	protected int 	numProtected 	= 12;
	public int 		numPublic 		= 13;
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter e");
		boolean t = scan.nextBoolean();
		
		int i = 0;
		int b = 11;
		
		if (t==true) i += 10;
		i +=1;
		System.out.println(i);
	}

}
