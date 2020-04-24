package day23_Encapsulation_Inheritance;

public class Encapsulation01 {
	
	
    private String Ccn = "1234567891011121";
    private int Ssn = 123456789;
    private boolean customer = true;
    
    
    public static void main(String[] args) {
        /*
         * OOP ==> Object Oriented Programming
         * 
         * OOP has 4 main fundementals 
         * 1)Polymorphism
         * 2)Inheritance
         * 3)Abstraction
         * 4)Encapsulation (Data Hiding)
         * 
         * Encapsulation: By using encapsulation  	1) we hide the data, and 
         * 											2) we can access the hidden data 
         *      For encapsulation ==> 1) Data must be private
         *                            2) Create public methods to access the hidden(private) data 
         *                               (getter methods ==> Reads the data)
         *                               (setter methods ==> Updates the data)
         */
    }
    
    public String getCcn() {
        return Ccn;
    }
    
    public int getSsn() {
        return Ssn;
    }
    
    // 1) You have to create a getter method for every private data, if you 
    //    want to read.
    // 2) If you do not want to update the data, do not create setter method.
    //    If you do not create setter methods for private variables, it means 
    //    no data can be updated in the class. That kind of classes are called 
    //    "immutable classes"
    
    public boolean isCustomer() {
        return customer;
    }
    
    public void setCustomer(boolean isCustomer) {
        this.customer = isCustomer;
    }
}
	

