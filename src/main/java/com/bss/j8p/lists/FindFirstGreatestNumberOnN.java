package com.bss.j8p.lists;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstGreatestNumberOnN {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(11, 19,1,5,23,10, 11, 11,22);
		
		System.out.println("Find First Highest Number");
		Optional<Integer> firstHighest = numbers.stream().filter(n->n>10).sorted().findFirst();
		System.out.println(firstHighest.get());
		
		System.out.println("Count Numbers greater than N");
		Long count = numbers.stream().filter(n->n>10).count();
		System.out.println(count);
		
		System.out.println("Find Sum of Numbers");
		Integer sum = numbers.stream().reduce(1, (a,b)->a+b);
		System.out.println(sum);
		
		
		System.out.println("Find Greatest Numbers");
		// Integer greatest = numbers.stream().reduce(0,(a,b)->Integer.max(a, b));
		// System.out.println(greatest);
		Optional<Integer> greatest = numbers.stream().reduce(Integer::max);
		System.out.println(greatest.get());
		
	}

}
