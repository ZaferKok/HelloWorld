package day21_passby_date_accessmodifiers;

import java.util.ArrayList;
import java.util.List;

public class WarmUp21 {

	public static void main(String[] args) {

		 List<Integer> list1 = new ArrayList<>(); 
		 list1.add(111);
		 list1.add(222);
		 list1.add(333);
		 list1.add(444);
		 List<Integer> list2 = new ArrayList<>();
		 list2.add(555);
		 list2.add(666);
		 list2.add(777);
	
		 list1.addAll(list2);
		 
		 System.out.println(list1);
	
	
	
	}

}
