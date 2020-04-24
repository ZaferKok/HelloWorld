package day25_overriding_polymorphism;

public class MethodSignature {

	public static void main(String[] args) {
		

	}
	// Signature is method name and parameter list.
	// To check if the methods are same or not: 
	// look at just method name and parameters list
	// When you look at the parameter list just look at the data types
	public void add(int num1, int num2) {
		System.out.println("The sum : " + (num1+num2));
	}
	
	protected int add2(int num3, int num4) {
		return num3 + num4;
	}
}
