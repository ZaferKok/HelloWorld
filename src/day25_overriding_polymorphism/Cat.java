package day25_overriding_polymorphism;

public class Cat extends Animal{
	 // Overriding is between child and parent
    public static void main(String[] args) {
        Cat cat = new Cat();
//      Animal animal = new Animal();
//      animal.sound();  ==> Not recommended
       // cat.sound();
        cat.sound();
           
    }
    // Access modifier of the overriding method (method of child class) cannot be 
    // more restrictive than the overridden method (method of parent class) of 
    // parent class.
    
    // private, static, and final methods cannot be overridden
    // public final int num = 10; ==> if you use final keyword for a variable
    // you cannot change its value
    
    // public final int add(){ } ==> If you use final keyword for a method, 
    // it means you cannot override the method.
    
    public void sound() {
    	super.sound(); //Inside the overriding method, if you use "super" keyword
                       //you can call overridden method.
        System.out.println("Cats meow");
    	int num = 2;
    	System.out.println(num);
    }

}
