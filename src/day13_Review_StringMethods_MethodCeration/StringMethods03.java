package day13_Review_StringMethods_MethodCeration;

public class StringMethods03 {

	public static void main(String[] args) {
		

		
		//isDigit() checks the character to be digit or not and returns boolean
        boolean result = Character.isDigit('2');    // wrapper class of char --> Character
        boolean result2 = Character.isDigit('A');
        System.out.println(result);
        System.out.println(result2);
        
        //isAlphabetic() checks the character to be an alphabet or not and returns boolean
        
        boolean result3 = Character.isAlphabetic('A');
        boolean result4 = Character.isAlphabetic('!');
        System.out.println(result3);
        System.out.println(result4);
	}

}
