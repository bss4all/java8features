package com.bss.j8p.lists;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListHighestElement {

	public static void main(String[] args) {
		List<Integer> intsList = Arrays.asList(10, 21, 32, 67, 103, 45, 1, -1);
		System.out
				.println(intsList.stream().filter(n -> n > 0).distinct().sorted(Comparator.reverseOrder()).findFirst());
		intsList.stream().filter(n -> n > 0).distinct().sorted(Comparator.reverseOrder()).limit(1)
				.forEach(System.out::print);
	}

}
