package day22_stringbuilder;

public class StringBuilderMethod02 {

	public static void main(String[] args) {
		/* Create a String “United Kingdom”.
		* 1)Print the length of the String on the console.
		* 2)Find the first occurence of the char ‘n’
		* 3)Find the last occurence of the char ‘n’ 
		* Find the character in index 4
		* Make the String "United Kingdom 2020"
		* Insert X 
		* Delete xX 
		* REVERSE 
		*  
		* 
		* */
		
		StringBuilder sb1 = new StringBuilder("United Kingdom");
	
		System.out.println(sb1.length());
		System.out.println("first occurence : " + sb1.indexOf("n"));
		System.out.println(sb1.lastIndexOf("n"));
		System.out.println(sb1.charAt(4));
		System.out.println(sb1.substring(4,5));
		System.out.println(sb1.append(" 20").append("20"));
		System.out.println(sb1.insert(3, "X"));
		System.out.println(sb1.insert(sb1.indexOf("i")+1, "x"));
		System.out.println(sb1.delete(3, 5));
		System.out.println(sb1.deleteCharAt(6));
		System.out.println(sb1.reverse());
	}

}
