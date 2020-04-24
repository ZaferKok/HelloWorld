package day22_stringbuilder;

public class StringBuilderMethod01 {

	public static void main(String[] args) {
		// Create a String which has at least 7 characters by using StringBuilder class
		// 1)Print on the console last 5 characters
		// 2)Print on the console first 5 characters

		StringBuilder sb1 = new StringBuilder("kamilem");
		StringBuilder sb2 = new StringBuilder();
		sb2.append("Kamilem");
		StringBuilder sb3 = new StringBuilder(20); // the length is not important. just for java's memory sharing
		sb3.append("Tarık");
		System.out.println("Last 5 chars : " + sb1.substring(2));
		System.out.println("First 5 chars" + sb1.substring(0, 5));
		
		
		
		
		
	}

}
