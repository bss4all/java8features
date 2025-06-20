package com.bss.j8p.interviewtests;

import java.text.DateFormat;
import java.time.Clock;
import java.util.Date;
import java.util.TimeZone;

public class NisumISTToPSTTime {

	public static void main(String[] args) {
		Date startTime = new Date(); // current date time
		System.out.println(startTime);
		TimeZone pstTimeZone = TimeZone.getTimeZone("America/Los_Angeles");
		DateFormat formatter = DateFormat.getDateTimeInstance();
		formatter.setTimeZone(pstTimeZone);
		String formattedDate = formatter.format(startTime);
		System.out.println(formattedDate);

		System.out.println(Clock.systemUTC().instant());
	}

}
