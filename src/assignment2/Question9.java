package assignment2;

public class Question9 {

	public static void main(String[] args) {
		/* int numA = 4;
int numB = 7;
String str1 = “Java”
String str2 = “Data”
Type a program to see “Data-3 Java11” as output on the console
by using “concatenation” operation.
*/
		int numA = 4;
		int numB = 7;
		String str1 = "Java";
		String str2 = "Data";
		
		System.out.println(str2 + (numA-numB) + " " + str1 + 
				(numA+numA-numB) + (numA+numA-numB));

		//System.out.println(str2+ (numA-numB) + "  " + str1 + (numA+numB));    
		
	}

}
