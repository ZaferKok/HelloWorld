package day24_inheritance_certificate_prep;

public class RunningOrderOfConstructorsChild extends RunningOrderOfConstructorsParent {

	public static void main(String[] args) {

		RunningOrderOfConstructorsChild objChild = new RunningOrderOfConstructorsChild();
		
		
	}
	// Every time Parent Constructor runs first.
	// If Parent constructor does not run first, we cannot use data inside the parent class.
	// Then, child constructor runs and be available to use parent data
	
	public RunningOrderOfConstructorsChild () {
		super(5, "year");
		//super(5); In a child constructor, you can use super() just once. Because,
					// If you use it twice, second one cannot be the first statement.
					// super() must be first statement in a constructor every time. otherwise it complains.
					// super() is used to call parent constructor
				    // If you do not use super(), you can use just parent constructor without parameter.
		System.out.println("This is the construtor of the Child class");
	}
	
	
}
