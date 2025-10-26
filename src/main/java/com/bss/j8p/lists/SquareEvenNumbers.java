package com.bss.j8p.lists;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareEvenNumbers {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		numbers.stream().filter(n->n%2==0).map(n->n*n).forEach(System.out::println);
		List<Integer> result = numbers.stream().filter(n->n%2==0).map(n->n*n).collect(Collectors.toList());
		System.out.println(result);

		List<Integer> result1 = numbers.stream().filter(n->n%2==0).map(n->n*n).toList();
		System.out.println(result1);
		
		System.out.println("Sum of Even Numbers in List");
		Integer sum = numbers.stream().filter(n->n%2==0).reduce(0, (a,b)->a+b);
		System.out.println(sum);
		
		System.out.println("Sum of Odd Numbers in List");
		Integer sum1 = numbers.stream().filter(n->n%2!=0).reduce(0, (a,b)->a+b);
		System.out.println(sum1);
		
		System.out.println("Sum of Square of Even Numbers in List");
		Integer sum2 = numbers.stream().filter(n->n%2==0).map(n->n*n).reduce(0, (a,b)->a+b);
		System.out.println(sum2);

	}

}
