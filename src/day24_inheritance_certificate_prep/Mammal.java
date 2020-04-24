package day24_inheritance_certificate_prep;

public class Mammal extends Animal {
	
	public int maxAge = 110;
	protected String name = "Mammal";
	
	public static void main(String[] args) {
		Mammal mammal = new Mammal(); 		// Default constructors are coming from Object class
		// Mammal class is inheriting default constructor from Object Class
		System.out.println(mammal.eat);		// from parent Animal class
		System.out.println(mammal.move);	// from parent Animal class
		mammal.drink(); 					// from parent Animal class
		
		System.out.println(mammal.maxAge);	// from Mammal class
		System.out.println(mammal.name);	// from Mammal class
		mammal.feedBaby();					// from Mammal class
	}
	public void feedBaby() {
		System.out.println("Mammals feed their baby with milk");
	}
}
