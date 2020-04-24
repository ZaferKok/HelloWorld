package day17_static_arrays;

public class ArrayQuestion00 {

	public static void main(String[] args) {
		/*1)Declare two Arrays
		 2)Create two Arrays which has 4 elements
		 3)Initialize all elements, for the first Array use the long way to initialize
		 for the second one use the short way to initialize
		 */
		String arraySt1[] = {"Ali", "Veli", "Ayse", "Fatma"};
		String arraySt[] = new String[2]; // Here I put reference
		
		char arr0[] = {'a', 'b', 'c'};
		
		char arr1[] = new char[4];
		arr1[0] = 'a';
		arr1[1] = 'b';
		arr1[2] = 'c';
		arr1[3] = 'd';
			System.out.println(arr1[3]);
		
		//If you use index more than or equal to length of an array
			// 1) We do not get compile time error
			// 2) We get runtime error which is "ArrayIndexOutOfBoundsException"
		int myFirstArray[] = new int[4]; // Here I put primitive
		myFirstArray[0] = 10;
		myFirstArray[1] = 20;
		myFirstArray[2] = 30;
		myFirstArray[3] = 40;
		
		for (int i = 0; i<4; i++) {
			System.out.println(arr1[i]);
		}
		
		for (int i = 0; i<4; i++) {
			System.out.println(arraySt1[i]);
		}
		
		for (int i = 0; i<4; i++) {
			System.out.println(myFirstArray[i]);
		}
		
		int size = myFirstArray.length;
		System.out.println(size);
		
		for (int i = 0; i<4; i++) {
			System.out.println(arr0[i]);
		}
	}

}


    
 

    


