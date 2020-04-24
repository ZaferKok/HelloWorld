package day26_exceptions;

public class Exception03 {

	public static void main(String[] args) {
		indexNum("Java", 3);
		indexNum("Java", 5);
	}
	// try block cannot be used single. it must be 
	// together with catch block or/and finally block every time.
	// finally block runs every time.(Interview)
	// If you use 'finally' together with 'try', try works.
	// If you need a code to run under every condition use 'finally block'
	// finally block can be used for example, ending connection to AmazonWebSite or saving file
	// after updating, to close the browser, to close a file etc...
	//We can use try + catch + finally together
    
    //If Java finds an exception stops execution and tries to catch exception
    //Therefore, in the given code ArithmeticException will not be caught 
	public static void indexNum(String str, int idx) {
		try { 
			System.out.println("Result: " + str.charAt(idx));
			System.out.println(idx/0); // this block also not works if try block find upper line.
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("Be careful about the index");
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Be careful about the index 2 catch block"); // if it catchs in first catch, this block does not work.
		}catch(ArithmeticException e) {
			System.out.println("Aritmetic problem");
		}finally {
			System.out.println("You did a good job!");
		}
	}
}
