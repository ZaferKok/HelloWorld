package day23_Encapsulation_Inheritance;

public class Encapsulation04 {

	public static void main(String[] args) {
		
		Encapsulation03 obj2 = new Encapsulation03();
		
		System.out.println("Account value : " + obj2.getAccount());
		System.out.println("Initial value : " + obj2.getInitial());
		System.out.println("Male value : " + obj2.isMale());
		
		
		obj2.setAccount(6789);
		obj2.setInitial('A');
		obj2.setMale(false);
		System.out.println("Updated account value : " + obj2.getAccount());
		System.out.println("Updated initial value : " + obj2.getInitial());
		System.out.println("Updated male value : "+ obj2.isMale());
	}

}
