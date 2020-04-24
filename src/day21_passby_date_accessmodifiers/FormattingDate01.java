package day21_passby_date_accessmodifiers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingDate01 {

	public static void main(String[] args) {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy"); // istediğin gibi formatı değiştirebilirsin. 
		// 3 M kullanırsan yazı ile yazıyor. 2 M yaparsan rakamla yazıyor. M büyük ise ay. küçük ise dakika,
		
		LocalDate date = LocalDate.now();
		
		System.out.println(dtf.format(date));
		

	}

}
