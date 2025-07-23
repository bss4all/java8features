package com.bss.j8p.streams;

import java.util.Map;

public class MapsCreation {

	public static void main(String[] args) {
		Map<String, Integer> map1 = Map.of("a", 1, "b", 2, "c", 3, "d", 4);
		map1.forEach((k, v) -> System.out.println(k + " : " + v));
		System.out.println("===========================================");
		Map<String, Integer> map2 = Map.ofEntries(
				Map.entry("a", 1), 
				Map.entry("b", 2), 
				Map.entry("c", 3),
				Map.entry("d", 4));
		map2.forEach((k, v) -> System.out.println(k + " : " + v));
		System.out.println("===========================================");
		
	}

}
