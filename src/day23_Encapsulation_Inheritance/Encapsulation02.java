package day23_Encapsulation_Inheritance;

public class Encapsulation02 {
	
    public static void main(String[] args) {
        
        Encapsulation01 obj1 = new Encapsulation01();
        
        System.out.println(obj1.getCcn());  
        System.out.println(obj1.getSsn());  
        System.out.println(obj1.isCustomer()); //true
        
        
        obj1.setCustomer(false); // By using set method, I changed true to false
        // setter methods return void; therefore, we cannot put them inside System.out.println()
        System.out.println(obj1.isCustomer()); // I read the updated value which is false
    
    
    }
}