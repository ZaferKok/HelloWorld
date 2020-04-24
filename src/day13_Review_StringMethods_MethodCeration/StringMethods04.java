package day13_Review_StringMethods_MethodCeration;

public class StringMethods04 {

	public static void main(String[] args) {
		/*
		 * 
		 */
		
		boolean r = Character.isDigit('2');
		boolean rr = Character.isDigit('b');
		boolean rrr = Character.isAlphabetic('3');
		boolean rrrr = Character.isAlphabetic('c');
		
		System.out.println(r);
		System.out.println(rr);
		System.out.println(rrr);
		System.out.println(rrrr);
		
		if (2>=0 && 2<=9) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}

}
