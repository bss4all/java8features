package com.bss.j8p.arrays;

import java.util.Arrays;

public class ReduceExamples {

	public static void main(String[] args) {
		int[] numbers = { 1, 21, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = Arrays.stream(numbers).reduce(0, Integer::sum);
		System.out.println(sum);
		int sum1 = Arrays.stream(numbers).reduce(0, (a, b) -> a + b);
		System.out.println(sum1);
		int max1 = Arrays.stream(numbers).reduce(0, Integer::max);
		System.out.println(max1);
		int min1 = Arrays.stream(numbers).reduce(0, Integer::min);
		System.out.println(min1);
	}

}
