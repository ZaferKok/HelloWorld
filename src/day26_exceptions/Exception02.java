package day26_exceptions;

public class Exception02 {
	
	public static void main(String[] args) {
		division(12,3);
		division(12,0);
	}
	public static void division(int num1, int num2) {
		try {
			System.out.println("Result: " + num1/num2);
		}catch(ArithmeticException e) {
			System.out.println("No number can be divided by zero");
		}
	}
	
}
