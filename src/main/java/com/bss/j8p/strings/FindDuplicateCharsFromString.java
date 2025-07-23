package com.bss.j8p.strings;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateCharsFromString {

	public static void main(String[] args) {
		String input = "gainjavaknowledge";

		System.out.println("duplicate chars:");
		Arrays.stream(input.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().filter(ele -> ele.getValue() > 1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList())
				.forEach(System.out::println);

		System.out.println("unique chars:");
		Arrays.stream(input.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().filter(ele -> ele.getValue() == 1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList())
				.forEach(System.out::println);

		Arrays.stream(input.split(""))
			.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
			.entrySet().stream().filter(e->e.getValue()>1)
			.forEach(System.out::println);

	}

}
