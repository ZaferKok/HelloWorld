package day28_abstraction_interface;
// abstract class ın varlığının sebebi zorunlu inheritence.
public abstract class Abstract01 { // soyut class
	// If you use "abstract" keyword do not create body.
	// If you do not use " abstract" keyword do not forget to create body.

	public abstract void abs(); // soyut method
	public abstract void abs2(); // soyut method
	
	// We can create concrete methods inside abstract classes; however,
	// We cannot create abstract method inside concrete classes.
	// No need to inherit concrete methods form child classes.
	public void concrete() { // This is concrete method. yani somut method.
		System.out.println("This is not abstract");
	}
	
} // <= This curly brace is of the Abstract01 class.

class Dog2 extends Abstract01{
	// If you do not inherit any abstract method from parent class
	// You will get compile time error.
	public void abs() {
		System.out.println("I have to inherit all abstract methods");
	}
	public void abs2() {
		System.out.println("I have to inherit all abstract methods");
	}

}
