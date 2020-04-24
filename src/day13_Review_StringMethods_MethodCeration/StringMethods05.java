package day13_Review_StringMethods_MethodCeration;

public class StringMethods05 {

	public static void main(String[] args) {

		String str = "Java says hello world. Java String tutorial";
		
		//Replace first occurrence of substring "Java" with "JAVA"

		String r = str.replaceFirst("Java", "JAVA");
		System.out.println(r);
		
		String r2= str.replaceFirst("a", "X");
		System.out.println(r2);
		
		String r3 = str.replaceFirst("\\s", "***");
		System.out.println(r3);
	}

}
