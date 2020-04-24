package day28_abstraction_interface;

public abstract class Abstract02 {
	public abstract void abs1();
}

abstract class Dog extends Abstract02 {
	// If child class is abstract, no need to inherit abstract methods.
	public abstract void abs2();
}

class Cat extends Abstract02 {
	public void abs1() {
		System.out.println("I inherited abs1 because Cat is concrete class");
	}
}

class Fish extends Dog {
	// When you extend an abstract class you have to inherit all abstract classes
	// form all parents.(parent, grant parent, grand grand parent...)
	public void  abs2() {
		System.out.println("I inherited abs2  because Fish is child concrete class");
	}
	public void abs1() {
		System.out.println("I inherited abs1 because Fish is grand child concrete class");
	}
}