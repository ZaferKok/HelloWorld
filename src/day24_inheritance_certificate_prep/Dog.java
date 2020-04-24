package day24_inheritance_certificate_prep;

public class Dog extends Mammal {

	public int height = 1;
	protected int weight = 50;
		
	
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		System.out.println(dog.maxAge); 	// from parent Mammal class
		System.out.println(dog.name);		// from parent Mammal class
		dog.feedBaby();						// from parent Mammal class
		
		System.out.println(dog.height);		// from child Dog class
		System.out.println(dog.weight);		// from child Dog class
		dog.bark();							// from child Dog class
		
		System.out.println(dog.eat);		// from grandparents Animal class
		System.out.println(dog.move);		// from grandparents Animal class
		dog.drink();						// from grandparents Animal class
			
		
	}

	public void bark() {
		System.out.println("Dog is barking!!");
	}
	
}
