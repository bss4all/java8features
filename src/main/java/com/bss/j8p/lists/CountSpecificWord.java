package com.bss.j8p.lists;

import java.util.Arrays;
import java.util.List;

public class CountSpecificWord {
	public static void main(String[] args) {
		// System.out.println("this is java program in java lang".split(" ").length);
		String sentence = "this is java program in java lang";
		List<String> wordsList = Arrays.asList(sentence.split(" "));
		System.out.println(wordsList.stream().filter(s -> s.equalsIgnoreCase("java")).count());
	}
}
