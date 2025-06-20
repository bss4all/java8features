package com.bss.j8p.datetimeapis;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZoneDateTimeAPI {
	public static void main(String[] args) {
		ZonedDateTime currentZone = ZonedDateTime.now();
		System.out.println("current time zone is " + currentZone);
		System.out.println("the current zone is " + currentZone.getZone());

		ZoneId tokyo = ZoneId.of("Asia/Tokyo");
		ZonedDateTime tokyoZone = currentZone.withZoneSameInstant(tokyo);
		System.out.println("tokyo time zone is " + tokyoZone);

		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatedDateTime = tokyoZone.format(format);
		System.out.println("formatted tokyo time zone " + formatedDateTime);
	}
}
