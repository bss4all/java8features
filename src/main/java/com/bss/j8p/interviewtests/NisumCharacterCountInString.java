package com.bss.j8p.interviewtests;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NisumCharacterCountInString {
	public static void main(String[] args) {
		String name = "SudhamshKumarBiruduraju";
		Map<Character, Long> cMap = name.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		cMap.forEach((k, v) -> {
			System.out.println(k + "" + v);
		});
		System.out.println();

		name.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() > 1)
				.forEach(entry -> System.out.println(entry.getKey() + "" + entry.getValue()));

	}
}
