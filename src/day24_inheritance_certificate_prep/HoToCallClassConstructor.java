package day24_inheritance_certificate_prep;

public class HoToCallClassConstructor extends HowToCallClassConstructorParent{

	public int num2 = 12;
	public String name ="Veli";
	
	public static void main(String[] args) {
		
		//HoToCallClassConstructor obj1 = new HoToCallClassConstructor();
		HoToCallClassConstructor obj2 = new HoToCallClassConstructor(4);
		// Java selects the constructor according to the parameters
	
	
	}
	public HoToCallClassConstructor () { // USE this() and this FOR INSIDE CLASS - USE super() and super FOR PARENT CLASS.
	//	this(5); // this() is used to call constructors just inside the class. You can also call from parents but don't do that
		super(); // super() is used for call constructors from parent.
		System.out.println(super.name);// super without parenthesis is used for call data inside and from parent.
		System.out.println(super.num); // super can be second, third, ...statement
		super.add(); 	 			   // you can use "super" more than once in a constructor.	
		System.out.println("Constructor without parameter");
	}
	public HoToCallClassConstructor (int num) {
		this();  // this() must be the first statement in a constructor
					// in a constructor you can use just one this().
				// this() and super() cannot be used at the same time in a constructor.
		System.out.println(this.num2);
		System.out.println(this.name); // this can be used to call data from parent class and in class; however, 
										// super can get data just from parent class. ****IMPORTANT
		System.out.println("Constructor with parameter");
	}
}
