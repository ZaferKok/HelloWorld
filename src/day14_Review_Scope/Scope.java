package day14_Review_Scope;

public class Scope {
		
		    int num; // Instance variable:Declare the variable inside the class, outside the all other methods 
		                 // Instance variables cannot be static
		                 // Instance variables cannot be called from static methods
		                 // You can call an instance variable from inside of every non-static method
		                 // If you do not assign a value, instance variable will get a default value(For numbers it is 0)
		    
		    public static void main(String[] args) {
		        /*
		         1)Variables declared inside class(outside any function).They can be directly accessed anywhere in class.
		         (Instance variables)(If you use static keyword it is called Class variables)
		         2)Variables declared inside a method have method level scope and can’t be accessed outside the method.
		         (Local Variables)(As a parameter or inside the body)
		         3)You can use a variable after declaring.
		         */
		    }
		    
		    public void scope01(int num3) {
		        int num2 = 4;     // Local Variable: If you declare a variable inside a mthod body, it is called
		                          //                 local variable. You can acces local variables just from inside the
		                          //                 method body.
		        num++;            // You have to assign a value for local variables
		    }
		    public void scope02() {
		        int num4 = 5; // To use a variable first declare than try to use
		        num4++;
		    }
		}


	


