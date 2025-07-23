package com.bss.j8p.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedCharCount {

	public static void main(String[] args) {
		String name = "Biruduraju Sudhamsh Kumar";
		Map<Character, Integer> charsCountMap = new HashMap<>();
		char[] charArr = name.toCharArray();
		for (int i = 0; i < charArr.length; i++) {
			if (charsCountMap.containsKey(charArr[i])) {
				int count = charsCountMap.get(charArr[i]);
				charsCountMap.put(charArr[i], count + 1);
			} else {
				charsCountMap.put(charArr[i], 1);
			}
		}
		// System.out.println(charsCountMap);

		char ch = 'd';
		// System.out.println(name.chars().filter(c -> c == ch).count());
		
		// Using Java 8 Stream API
		name.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.forEach((k,v)->System.out.println(k + " : " + v));	
		
		System.out.println("By using Streams in single line print >1");
		List<String> arr = Arrays.asList(name.split(""));
		arr.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.forEach((k, v) -> {
					if (v>1)
						System.out.println(k + " : " + v);
					});
		
		System.out.println("By using Streams in single line, by using entrySet");
		arr.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet().stream().filter(ele -> ele.getValue() > 1).map(Map.Entry::getKey).toList()
		.forEach(System.out::println);
		
		
		
	}

}
