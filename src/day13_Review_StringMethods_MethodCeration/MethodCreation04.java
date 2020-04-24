package day13_Review_StringMethods_MethodCeration;

public class MethodCreation04 {

	
		public static void main(String[] args) {
	        /*
	         * Create a method with parameters outside of the main method
	         * Method should calculate the sum of two numbers and print them on the console
	         * Call the method from inside main method with arguments
	         */
	        addTwoNums(2,3);
	        addTwoNums(2,3,4);
	        addTwoNums(5,"7");
	    }
	    
	    //If you change the number of parameters, or the data type of parameters, 
	    //the methods will be completely different
	    
	    public static void addTwoNums(int num1, int num2) {
	        System.out.println(num1+num2);  //5
	    }
	    
	    public static void addTwoNums(int num1, int num2, int num3) {
	        System.out.println(num1+num2+num3);//9
	    }
	    
	    public static void addTwoNums(int num1, String num2) {
	        System.out.println(num1+num2);  //57
	    }
	    
	

	}


