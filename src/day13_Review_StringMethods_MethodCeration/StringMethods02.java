package day13_Review_StringMethods_MethodCeration;

public class StringMethods02 {

	public static void main(String[] args) {
		/*Task: Use startsWith(), endsWith(), isEmpty() for str3.
String str3 = “This is for you to practice”;
*/

		String str1 = "Hello Java I am here";
		String str2 = "";
		String str3 = "This is for you to practice";
		
		boolean b1 = str3.startsWith("T");
		boolean b2 = str3.startsWith("This");
		boolean b3 = str3.startsWith("is for you to practice",5);
		boolean b4 = str3.endsWith("e");
		boolean b5 = str3.endsWith("practice");
		boolean b6 = str3.isEmpty();
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		System.out.println(b6);
		
	}

}
