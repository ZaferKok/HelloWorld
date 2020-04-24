package day15_constructors_static_keyword;

public class ObjectCreation01 {
	
	int price = 2000;
	int year = 2017;
	String make = "Honda";
	String model = "Accord";
	String type = "Sedan";
	
	public static void main(String[] args) {
		
        ObjectCreation01 car1 = new ObjectCreation01();
        
        //Before changing...
        System.out.println(car1.price);
        System.out.println(car1.make);
        
        car1.price = 5000;
        car1.make = "Toyota";
        
        //After changing
        System.out.println(car1.price);
        System.out.println(car1.make);
	}

}
