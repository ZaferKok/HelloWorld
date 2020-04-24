package day14_Review_Scope;

public class OverloadingRule01 {

	public static void main(String[] args) {



	}

public static void overload01(int num1) {
		System.out.println("If the number of parameters are different, overloading is okay");
	}
public static void overload01(int num1, int num2) {
		System.out.println("If the number of parameters are different, overloading is okay");
	}
	
}
/*1) Number of parameters.
 * 		add(int)
 * 		add(int, int)
 *		add(int, int, int)
 * 
 * methods name should be same
 */