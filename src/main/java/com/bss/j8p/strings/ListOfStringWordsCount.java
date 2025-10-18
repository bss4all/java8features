package com.bss.j8p.strings;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListOfStringWordsCount {

	public static void main(String[] args) {
		// list of string, with different sizes
		// find count of string present in each sized strings.
		
		String str = "list of string with different sizes find count of string present in each sized strings";
		List<String> strList = Arrays.asList(str.split(" "));
		
		System.out.println("Key is Length, Value is list of words");
		Map<Integer, List<String>> wordsMap = strList.stream()
				.collect(Collectors.groupingBy(String::length));
		wordsMap.forEach((l,s)->System.out.println("Length - "+ l + " words - " + s.stream().sorted().collect(Collectors.toList())));
		
		System.out.println("Key is Length, Value is cound of words");
		Map<Integer, Long> wordsCountMap = strList.stream()
				.collect(Collectors.groupingBy(String::length, Collectors.counting()));
		wordsCountMap.forEach((l,c)->System.out.println("Length - "+ l + " words count- " + c));
		
		
		
		
		
		// Map<String, Integer> wordsMap = strList.stream()
		//		.collect(Collectors.toMap(name -> name, name -> name.length()));
		// System.out.println(wordsMap);
	}

}
