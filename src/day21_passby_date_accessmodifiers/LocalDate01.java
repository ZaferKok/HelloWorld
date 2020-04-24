package day21_passby_date_accessmodifiers;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDate01 {

	public static void main(String[] args) {
		
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		System.out.println(LocalDate.now().plusDays(1));
		System.out.println(LocalDate.now().plusMonths(2));
		System.out.println(LocalDate.now().plusYears(7));
		System.out.println(LocalTime.now().plusMinutes(61));
		System.out.println(LocalDateTime.now().minusYears(5));
	}

}
