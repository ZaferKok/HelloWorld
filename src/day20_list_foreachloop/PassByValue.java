package day20_list_foreachloop;

public class PassByValue { // thats mean that java makes copies and then uses them
	
	public static void main(String[] args) {

		int num = 5;

		System.out.println(increment(num));// 6
		System.out.println(num);		   // 5	
		
	}

	public static int increment(int num) {
		num ++;
		return num;
	}

}
