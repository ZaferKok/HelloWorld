package day09_string_methods_for_loop;

public class ReplaceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "Easy Java is Easy!";
        
        /* 
         1)The replace() method returns a new string resulting from replacing every occurrence 
         of characters with a new characters.
         2)The replace() method accepts either char or character as a parameter
        */
        
        String str1 = str.replace('a', 'x'); // delete 'a', type 'x' for every 'a'
        String str2 = str.replace("Easy", "Hard"); 
        String str3 = str.replace("Ea", "Hard"); 
        String str4 = str.replace("Easy Java", "Hard"); 
        String str5 = str.replace(" ", "/"); 
        String str6 = str.replace("Easy", " "); 
        String str7 = str.replace("a", ""); // To delete some characters in a String use that way
        String str8 = str.replace('d', 'z');
                    
        System.out.println(str1);
	}

}
