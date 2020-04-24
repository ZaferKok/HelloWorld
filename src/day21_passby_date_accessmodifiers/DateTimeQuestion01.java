package day21_passby_date_accessmodifiers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeQuestion01 {

	public static void main(String[] args) {
		/*
		 * Take current date in the format 10/03/2020
		 * Add 1 year, 2 months, and 11 days.
		 * Print it on the console, output should be 21/05/2021
		 */
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
//		LocalDate date = LocalDate.now(); atayarak da yapılıyor.
//		
//		System.out.println(dtf.format(date));
		System.out.println(dtf.format(LocalDate.now()));

		System.out.println(LocalDate.now().plusYears(1).plusMonths(2).plusDays(11));
		System.out.println(dtf.format(LocalDate.now().plusYears(1).plusMonths(2).plusDays(11)));
	}

}
