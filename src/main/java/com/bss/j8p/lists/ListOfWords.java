package com.bss.j8p.lists;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListOfWords {

	public static void main(String[] args) {
		// list of string, with different sizes
		// find count of string present in each sized strings
		// Using Java 8 Stream API
		// Input : "list of string with different sizes find count of string present in each sized strings"
		// Output : {list=4, of=2, string=6, with=4, different=9, sizes=5, find=4, count=5, present=7, in=2, each=4, sized=5, strings=7}

		String str = "list of string with different sizes find count of string present in each sized strings";
		List<String> strList = Arrays.asList(str.split(" "));

		System.out.println("============count of each length strings=======================");
		Map<Integer, Long> countMap = strList.stream()
				.collect(Collectors.groupingBy(name -> name.length(), Collectors.counting()));
		System.out.println(countMap);

		System.out.println("============count of each string=======================");
		Map<String, Long> countMap1 = strList.stream()
				.collect(Collectors.groupingBy(name -> name, Collectors.counting()));

		System.out.println(countMap1);

		System.out.println("============each length strings details=======================");


		// find number of strings present in each length of string
		// Output : {2=2, 4=4, 5=3, 6=1, 7=2, 9=1}
		Map<Integer, List<String>> lengthMap = strList.stream().collect(Collectors.groupingBy(name -> name.length()));
		System.out.println(lengthMap);

		System.out.println("============each length strings details in sorted order=======================");
		// in descending order
		Map<Integer, List<String>> lengthMap1 = strList.stream().sorted(Comparator.reverseOrder())
				.collect(Collectors.groupingBy(name -> name.length(), Collectors.toList()));
		System.out.println(lengthMap1);

	}

}
