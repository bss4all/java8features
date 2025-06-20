package com.bss.j8p.lists;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestNumber {

	public static void main(String[] args) {
		List<Integer> intsList = Arrays.asList(10, 21, 32, 67, 103, 45, 1);
		System.out.println(intsList.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst());
	}

}
