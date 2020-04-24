package day16_static_keyword;

public class Static02WithoutMainMethod {
	
		int num1 = 3;
		String name1 = "Ali";
		public void method1() {
			System.out.println("I am an instance method");
		}
		
		static int num2 = 5;
		static String name2 = "Veli";
		public static void method2() {
	        System.out.println("I am a static method");
	    } 
}	
//Static Variable = Class Variable
//Instance Variable = Object Variable