package day09_string_methods_for_loop;

public class SubstringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					//0123456789	
		String str = "Banana, apple ";
        
        /* 
         The substring() method extract a part of a string and  
         returns the extracted parts in a new string. First index inside the parenthesis is inclusive
         second index inside the parenthesis is exclusive
         */
        
        String str1 = str.substring(0); 
        String str2 = str.substring(3);
        String str3 = str.substring(6);
        String str4 = str.substring(7); 
        String str5 = str.substring(12); //If you want to get the last character in a String use the last index 
        String str6 = str.substring(13);   //You will get nothing on the console 
        
        String str7 = str.substring(1,5); 
        String str8 = str.substring(6,7);
        String str9 = str.substring(4,4);
        //String str10 = str.substring(4,2);// In substring() index of first parameter must be less than 
                                          // index of second parameter. If you make them equal, you will get nothing
        
        System.out.println(str7);
	}

}
