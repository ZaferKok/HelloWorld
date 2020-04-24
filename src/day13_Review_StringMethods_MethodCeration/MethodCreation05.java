package day13_Review_StringMethods_MethodCeration;

public class MethodCreation05 {

	public static void main(String[] args) {
		/*Create a method outside of the main method
Get(Pass) first name and last name as a parameter into the method
If just the initials are uppercase, print on the console “Good job”
Call the method from inside the main method by using arguments*/
	
		checkUpperInitials("Salih", "Veli");
	
	}
	
	public static void checkUpperInitials(String name, String lame) {
	
		char n = name.charAt(0);
		char l = lame.charAt(0);
		
		if (n>='A' && n<='Z' && l>='A' && l<='Z') {
			System.out.println("Good Job");
		}else {
			System.out.println("It is not acceptable");
		}
	}
}
