package day09_string_methods_for_loop;

public class UpperCaseLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "Learn Java"; // toUpperCase() --> LEARN JAVA
         // toLowerCase() --> learn java

/* 
1)A string is converted to upper case with toUpperCase()
2)A string is converted to lower case with toLowerCase()
*/

		 String str1 = str.toUpperCase(); 
		 String str2 = str.toLowerCase();

		 String str3 = str.toUpperCase().toLowerCase();

		 String str4 = str.substring(6).toUpperCase();

		 String str5 = str.substring(4,8).toUpperCase();

		 String str6 = str.replace("L","").toUpperCase();

		 System.out.println(str4);
	}

}
