package day18_array_methods_multi_diamensional_arrays;

import java.util.Arrays;

public class SplitQuestion01 {

	public static void main(String[] args) {


		
		String s = "I liked Java, did you like it?";
		
		String str1[] = s.split("d");
		String str2[] = s.split(" ");
		
		System.out.println(Arrays.toString(str1));
		System.out.println(Arrays.toString(str2));

	}

}
