package day13_Review_StringMethods_MethodCeration;

public class StringMethods01 {

	public static void main(String[] args) {
		
		// stratsWith() method checks the initial character/characters and returns boolean

		String str1 = "Hello Java I am here";
		String str2 = "";
		
		boolean resultForInitial = str1.startsWith("H"); // case sensitive. if you ask for "h" it is false
		boolean resultForFirstWord = str1.startsWith("Hello");
		boolean resultForNotBeginnings = str1.startsWith("J",6);	
		boolean resultForNotBeginningsWord = str1.startsWith("Java",6); //6 index inclusive
		
		System.out.println(resultForInitial);
		System.out.println(resultForFirstWord);
		System.out.println(resultForNotBeginnings);
		System.out.println(resultForNotBeginningsWord);
		
		// endsWith() method checks the last character/characters and returns boolean
		
		boolean resultForLastCharacter = str1.endsWith("e"); // case sensitive.
		boolean resultForLastCharacters = str1.endsWith("here");
		
		System.out.println(resultForLastCharacter);
		System.out.println(resultForLastCharacters);
		
		// isEmpty() method checks the String whether it is empty or not and returns boolean
		
		boolean isEmpty = str1.isEmpty();
        boolean isEmptySecond = str2.isEmpty();
        System.out.println(isEmpty);
        System.out.println(isEmptySecond); // Space is also a character. It is not empty.
		
		
		
		
	}
}
