package day22_stringbuilder;

//Java program to demonstrate difference between String, StringBuilder, and StringBuffer 
public class DifferenceBetweenStringStringBuilderAndStringBuffer {
  
  public static void main(String[] args) 
  { 
      String s1 = "Ali";
      concatByUsingString(s1);  
      System.out.println("String: " + s1); 

      StringBuilder s2 = new StringBuilder("Ali"); 
      concatByUsingStringBuilder(s2);
      System.out.println("StringBuilder: " + s2); 

      StringBuffer s3 = new StringBuffer("Ali"); 
      concatByUsingStringBuffer(s3);  
      System.out.println("StringBuffer: " + s3); 
  }   
  // Concatenates to String 
  public static void concatByUsingString(String s1) 
  { 
      s1 = s1 + "Kemal"; 
  }  
  // Concatenates to StringBuilder 
  public static void concatByUsingStringBuilder(StringBuilder s2) 
  { 
      s2.append("Kemal"); 
  }   
  // Concatenates to StringBuffer 
  public static void concatByUsingStringBuffer(StringBuffer s3) 
  { 
      s3.append("Kemal"); 
  } 
}




