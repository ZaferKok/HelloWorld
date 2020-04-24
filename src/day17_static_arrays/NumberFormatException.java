package day17_static_arrays;

public class NumberFormatException {

	public static void main(String[] args) {


		int num = Integer.parseInt("ali"); // if you put number it works but for 
		System.out.println(num);			// exception we write there Ali
	}

}
//if you put a String cannot be converted to integer you will get NUMBERFORMATEXCEPTION