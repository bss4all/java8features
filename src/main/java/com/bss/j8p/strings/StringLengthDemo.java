package com.bss.j8p.strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringLengthDemo {

	public static void main(String[] args) {
		String sentence = "This is java program from java languare";
		List<String> strList = Arrays.asList(sentence.split(" "));
		System.out.println(strList.stream().sorted(Comparator.reverseOrder()).filter(s -> s.length() == 4).findFirst());
		strList.stream().sorted(Comparator.reverseOrder()).filter(s -> s.length() > 5).forEach(System.out::println);
	}

}
