package assignment2;

public class Question11 {

	public static void main(String[] args) {
		/*Type a program to create long, and int variables then,
		 *  cast their types to short.
		*/
		
		long num1 = 901;
		int num2 = 65536;
		
		
		long z = num1*num2;
		System.out.println(z);
		
		
		short num3 = (short)num2;
		System.out.println(num3);
		short num4 = (short)num1;
		System.out.println(num4);
	
		
		/*int int1=10;
        short short1=(short)int1;
        System.out.println(short1);
        long long1=5100; 
        short short2=(short)long1;
        System.out.println(short2);
*/
		
		
	}

}
