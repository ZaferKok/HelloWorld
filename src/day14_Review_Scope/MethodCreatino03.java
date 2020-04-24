package day14_Review_Scope;

public class MethodCreatino03 {

	public static void main(String[] args) {
        /*
         * Task: Create a method outside of the main method like;
         * Method will have two integer parameters and return the difference of them
         * Call the method from inside the main method.
        */ 
        System.out.println(diffTwoNums(12,2));
    }
    // Every char has an integer value in Java; therefore, when you select int as a return type 
    // and if your method returns char, you will nor get any error message. This is trick, be careful about it
    
    public static int diffTwoNums(int num1, int num2) {
         //int diff = num1 - num2;
        //return diff;
        // That one works but longer and uses memory more; therefore, prefer the return num1 - num2;
        
        return num1 - num2;
    }
	
	
	
	
	
	
}
