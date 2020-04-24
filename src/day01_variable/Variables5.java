package day01_variable;

public class Variables5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// src meaning is source!!!!!!!!!!!!!!!
		
		int newborn = 0;
		int infant = 2;
		int toddler = 1;
		int preSchooler = 3;
		int schooler = 5;
		int teenager = 12;
		int youngAdult = 18;
		int middleAdult = 40;
		int maturity = 65;

		System.out.println("newborn = "+newborn+" - "+infant+" months");
		System.out.println("infant = "+infant+"months - "+toddler+" year");
		System.out.println("toddler = "+toddler+" - "+preSchooler+" years");
		System.out.println("preSchooler = "+preSchooler+" - "+schooler+" years");
		System.out.println("schooler = "+schooler+" - "+teenager+" years");
		System.out.println("teenager = "+teenager+" - "+youngAdult+" years");
		System.out.println("youngAdult = "+youngAdult+" - "+middleAdult+" years");
		System.out.println("middleAdult = "+middleAdult+" - "+maturity+" years");
		System.out.println("maturity = "+maturity+"years...");

		boolean isTrue=true;
		System.out.print("infant is younger than toddler ==> "+isTrue);
		isTrue=false;
		System.out.println("toddler is younger than infant ==> "+isTrue);
		isTrue=true;
		System.out.println("toddler is younger than preSchooler ==> "+isTrue);
		isTrue=false;
		System.out.println("preSchooler is younger than toddler ==> "+isTrue);
		isTrue=true;
		System.out.println("preSchooler is younger than schooler ==> "+isTrue);
		isTrue=false;
		System.out.println("schooler is younger than preSchooler ==> "+isTrue);
		isTrue=true;
		System.out.println("schooler is younger than teenager ==> "+isTrue);
		isTrue=false;
		System.out.println("teenager is younger than schooler ==> "+isTrue);
		isTrue=true;
		System.out.println("teenager is younger than youngAdult ==> "+isTrue);
		isTrue=false;
		System.out.println("youngAdult is younger than teenager ==> "+isTrue);
		isTrue=true;
		System.out.println("youngAdult is younger than middleAdult ==> "+isTrue);
		isTrue=false;
		System.out.println("middleAdult is younger than youngAdult ==> "+isTrue);
		isTrue=true;
		System.out.println("middleAdult is younger than maturity ==> "+isTrue);
		isTrue=false;
		System.out.println("maturity is younger than middleAdult ==> "+isTrue);

 
	}

}
