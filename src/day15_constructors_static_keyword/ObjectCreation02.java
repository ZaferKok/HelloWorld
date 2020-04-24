package day15_constructors_static_keyword;

public class ObjectCreation02 {
	
	int height = 178;
	int weight;
	String name;
	String gender;
	//Create CONSTRUCTOR outside the main method like instance variables
	ObjectCreation02() {
		
	}
//	ObjectCreation02(int height){
//		
//	}
	// When you create any constructor, default constructor will be deleted by garbage collector
	// You can create many CONSTRUCTOR. But the name of the constructor different or it must has different parameter or more parameter
	// Create constructor outside the main method like instance variables
    // When you create any constructor, default constructor will be deleted by garbage collector
	public static void main(String[] args) {
		
		ObjectCreation02 human1 =new ObjectCreation02();
		System.out.println(human1.height);
		
		human1.name = "Ahmet";
		System.out.println(human1.name);
	
	}
}
