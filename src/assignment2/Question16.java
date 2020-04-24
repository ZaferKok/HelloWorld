package assignment2;

public class Question16 {

	public static void main(String[] args) {
		/*Type at least three sentences to explain casting types
		 * 
		 */

		/* CASTING TYPES:
		 * 
		 * Casting a primitive data type to greater one then 
		 * java does it automatically
		 * 
		 * If you type it to lower one the you need to make it manually
		 * It is not going to work automatically
		 * 
		 * Automatic
		 * byte=>short=>int=>long=>float=>double
		 * 
		 * Manual
		 * byte<=short<=int<=long<=float<=double
		 * double
		 */
		
		byte num1 = 127;
		int num2 = num1; 			// AUTOMATIC
		byte num3 = (byte)num2; 	// MANUALLY
	
		System.out.println(num3);
	}

}
