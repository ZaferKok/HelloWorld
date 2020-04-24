package day26_exceptions;

public class Exception01 {
	// when you type a code, if you notice possible errors, you can use 
	// 'throws' keyword with exception name to declare the possible error.
	// bunu buraya kod okuyucu gorsun diye yaziyoruz. Kim okuyorsa artık.
	// If you declare exception after method name (not inside the body), use "throws" keyword.
	// Sometimes we will declare exception inside the method body, then we will use 'throws' word.
	public static void main(String[] args) throws ArithmeticException { 
		System.out.println(division(12,2));
		System.out.println(division(12,0));
	}
	public static int division(int num1, int num2) {
		return num1/num2;
	}

}