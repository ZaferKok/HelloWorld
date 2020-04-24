package day09_string_methods_for_loop;

public class ReplaceAllAndRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "Easy Java is Easy 12_34!";
        
        /* 
         1)The java string replaceAll() method returns a string replacing all the sequence of characters 
         matching "regular expression" and replacement string.
         2)replaceAll() does not accept char as a parameter
         3)replace() does not accept "regex" as a parameter. (Interview question)
        */
        
        String str1 = str.replaceAll("Easy", "Hard"); 
        String str2 = str.replaceAll("\\s", "*"); //A whitespace character
        String str3 = str.replaceAll("\\S", "*"); //A non-whitespace character
        
        String str4 = str.replaceAll("\\w", "*"); //A word character, short for [a->z  A->Z  0->9  _]
        String str5 = str.replaceAll("\\W", "*"); //A non-word character, that is except [a->z  A->Z  0->9  _]
        
        String str6 = str.replaceAll("\\d", "*"); //Any digit, short cut for [0-9]
        String str7 = str.replaceAll("\\D", "*"); //Any non-digit, that is except [0-9]
        
        String str8 = str.replaceAll(" ", "*"); 
        String str9 = str.replaceAll("Easy", " "); 
        String str10 = str.replaceAll("Easy", "");// to delete characters in a String use that one
                    
        System.out.println(str7);
	}

}
