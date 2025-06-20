package com.bss.j8p.datetimeapis;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class PeriodDurationTest {

	public static void main(String[] args) {

		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(2025, Month.DECEMBER, 25);

		// PERIOD
		Period gap = Period.between(date1, date2);
		System.out.println("gap between days is a period of " + gap.getDays());
		System.out.println("gap between months is a period of " + gap.getMonths());
		System.out.println("gap between years is a period of " + gap.getYears());
		System.out.println("gap between dates is a period of gap " + gap);

		// DURATION
		LocalTime time1 = LocalTime.now();
		System.out.println("the current time is " + time1);

		Duration fiveHours = Duration.ofHours(5);

		// adding five hours to the current
		// time and storing it in time2
		LocalTime time2 = time1.plus(fiveHours);

		System.out.println("after adding five hours of duration " + time2);

		Duration gap1 = Duration.between(time2, time1);
		System.out.println("Duration gap between time1 & time2 is " + gap1);
	}

}
