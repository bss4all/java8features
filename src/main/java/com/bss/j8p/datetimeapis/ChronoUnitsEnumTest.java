package com.bss.j8p.datetimeapis;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ChronoUnitsEnumTest {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println("current date is :" + date);

		// adding 2 years to the current date
		LocalDate year = date.plus(2, ChronoUnit.YEARS);

		System.out.println("next to next year is " + year);

		// adding 1 month to the current date
		LocalDate nextMonth = date.plus(1, ChronoUnit.MONTHS);

		System.out.println("the next month is " + nextMonth);

		// adding 1 week to the current date
		LocalDate nextWeek = date.plus(1, ChronoUnit.WEEKS);

		System.out.println("next week is " + nextWeek);

		// adding 2 decades to the current date
		LocalDate Decade = date.plus(2, ChronoUnit.DECADES);

		System.out.println("20 years after today " + Decade);
	}

}
