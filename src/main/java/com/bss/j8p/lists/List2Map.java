package com.bss.j8p.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class List2Map {

	public static void main(String[] args) {
		int[] array = new int[] { 18, 67, 134, 87, 11, 11 };
		List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
		Map<Integer, Long> map = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);

		Map<Integer, Integer> map1 = Arrays.stream(array).boxed()
				.collect(Collectors.groupingBy(e -> e, Collectors.reducing(0, e -> 1, Integer::sum)));
		System.out.println(map1);

		List<String> names = Arrays.asList("John", "Mary", "Bob");

		// Convert the list to a map using the Collectors.toMap() method
		Map<String, Integer> nameMap = names.stream().collect(Collectors.toMap(name -> name, name -> name.length()));

		// Print the map
		System.out.println(nameMap);

		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Banana");
		fruits.add("Guava");
		fruits.add("Pineapple");
		fruits.add("Apple");
		System.out.println("Elements in ArrayList are : " + fruits);

		HashMap<String, Integer> res = fruits.stream()
				.collect(Collectors.toMap(Function.identity(), String::length, (e1, e2) -> e1, HashMap::new));

		Map<String, Integer> res1 = fruits.stream().collect(Collectors.toMap(Function.identity(), String::length));

		System.out.println("Elements in HashMap are : " + res);

		System.out.println("Elements in Map are : " + res1);

	}

}
