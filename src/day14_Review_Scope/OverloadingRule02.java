package day14_Review_Scope;

public class OverloadingRule02 {

	public static void main(String[] args) {
		/* Data type of parameters.
		 * 		add(int, int)
		 * 		add(int, String)
		 * 		add(float, String)
		 */

	}
public static void overLoad02(int num1) {
	System.out.println("Changing parameer's data type is okay for overloading");
}
public static void overLoad02(String str) {
	System.out.println("Changing parameer's data type is okay for overloading");
}

}
