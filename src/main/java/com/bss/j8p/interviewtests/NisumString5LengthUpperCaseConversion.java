package com.bss.j8p.interviewtests;

import java.util.ArrayList;
import java.util.List;

public class NisumString5LengthUpperCaseConversion {

	public static void main(String[] args) {
		List<String> strs = new ArrayList<String>();
		strs.add("sudhamsh");
		strs.add("kumar");
		strs.add("biruduraju");

		strs.stream().filter(s -> s.length() > 5).map(m -> m.toUpperCase()).forEach(System.out::println);

	}

}
