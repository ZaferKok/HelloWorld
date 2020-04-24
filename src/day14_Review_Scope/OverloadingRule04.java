package day14_Review_Scope;

public class OverloadingRule04 {

	public static void main(String[] args) {
		
	        /*
	          When a data type of smaller size is promoted to the data type of bigger size 
	          overloading works and the bigger one will run. 
	          For example: byte data type can be promoted to short, 
	          a short data type can be promoted to int, long, double etc.
	        */
	        method01(10);
	    }
	    
	    public static void method01(byte num) {
	        System.out.println("Byte data type is used");
	    }
	    
	    public static void method01(int num) {
	        System.out.println("int data type is used");
	    }

}
