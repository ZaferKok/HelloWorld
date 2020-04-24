package assignment2;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		/*Ask user to enter the price of an item that is on clearance (60% off),
and user has a coupon for an additional 30% off the clearance.
Calculate the final cost of the item.
*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your price of your item");
		float price = scan.nextFloat();
		
		float priceOff60 = price - (price*60/100);
		float priceOff30 = priceOff60 - (priceOff60*30/100);
		
		System.out.println("The last price of your item is: " + priceOff30);	
		

	}

}


/*import java.util.Scanner;
public class Question5 {
public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the price");
    float price=scan.nextFloat();
    price=(price*40)/100;
    price=(price*70)/100;
    System.out.println("Final cost of the item " + price );
*/