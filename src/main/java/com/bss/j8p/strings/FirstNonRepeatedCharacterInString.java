package com.bss.j8p.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacterInString {

	public static void main(String[] args) {
		String name = "Biruduraju Sudhamsh Kumar";

		System.out.println("1 - without collections");

		for (int i = 0; i < name.length(); i++) {
			boolean unique = true;
			for (int j = 0; j < name.length(); j++) {
				if (i != j && name.charAt(i) == name.charAt(j)) {
					unique = false;
					break;
				}
			}
			if (unique) {
				System.out.println(name.charAt(i));
				break;
			}
		}

		System.out.println("2 - with collections");
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (charMap.containsKey(ch)) {
				int count = charMap.get(ch);
				charMap.put(ch, count + 1);
			} else {
				charMap.put(ch, 1);
			}
		}
		for (Entry<Character, Integer> entrySet : charMap.entrySet()) {
			if (entrySet.getValue() == 1) {
				System.out.println(entrySet.getKey());
				break;
			}
		}
		
		
		System.out.println("3 - with Java 8 Streams");
		name.chars().mapToObj(c -> (char) c)
				.collect(java.util.stream.Collectors.groupingBy(c -> c, java.util.stream.Collectors.counting()))
				.entrySet().stream().filter(ele -> ele.getValue() == 1).map(Entry::getKey).findFirst()
				.ifPresent(System.out::println);
		List<String> arr = Arrays.asList(name.split(""));
		arr.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet().stream().filter(ele -> ele.getValue() == 1).findFirst().ifPresent(System.out::println);
		
	}

}
