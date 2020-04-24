package day09_string_methods_for_loop;

public class LastIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Banana, apple";
        
        int idx1 = str.lastIndexOf("a"); //lastIndexOf() returns us the index of the last occurrence 
                                         //of a character in a string.
        
        int idx3 = str.lastIndexOf("w");    // If a character is not found, indexOf() returns -1
        int idx4 = str.lastIndexOf("Text"); // If a text is not found, lastIndexOf() returns -1
        
        int idx5 = str.lastIndexOf("an"); // If a text is found, lastIndexOf() returns us the index of the 
                                             // initial of the text
        
        int idx6 = str.lastIndexOf("a", 4);  //The indexOf() method accepts a second parameter as 
                                             // the ending position for the search
        
        int idx7 = str.lastIndexOf("a", 5); // If the second parameter is the index of the character
                                            // which you are looking for, then lastIndexOf() returns the 
                                            // second parameter.
        
        int idx8 = str.lastIndexOf("an", 3); //lastIndexOf() looks for "an" among the first 4 characters,
                                             // and returns the index of the initial of the last "an"
        
        System.out.println(idx8);
	}

}
