package day14_Review_Scope;

public class MethodCreation02 {

	public static void main(String[] args) {
        /*
         * Create a method outside of the main method like;
         * Method will have two integer parameters and return the product of them
         * Call the method from inside the main method.
        */ 
        System.out.println(productOfTwoNums(0,12));
    }
    //If you use any return type except void, you have to put return keyword at the end.
    //The data type which the method returns must match with the return type in the method
    //If you use return type except void do not forget to use System.out.println() inside the main method's body
    
    public static int productOfTwoNums(int num1, int num2) {
        return num1 * num2;
    }

}

