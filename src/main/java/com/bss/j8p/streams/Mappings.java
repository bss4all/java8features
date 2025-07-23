package com.bss.j8p.streams;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Mappings {

	public static void main(String[] args) {
		var list1 = IntStream.range(1, 10).mapToObj(i -> "Number: " + i).toList();
		list1.forEach(System.out::println);
		
		var list2 = IntStream.range(1, 10).boxed().map(i -> (double)i).toList();
		list2.forEach(System.out::println);
		
		var list3 = IntStream.range(1, 10).boxed().map(i -> (double)i).collect(Collectors.toList());
		list3.forEach(System.out::println);
	}

}
