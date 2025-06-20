package com.bss.j8p.lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intsList = Arrays.asList(10, 21, 32, 67, 103, 45, 21);
		intsList.stream().forEach(System.out::println);
		System.out.println("--------without duplicates---------");
		intsList.stream().collect(Collectors.toSet()).forEach(System.out::println);
		System.out.println("-------with decending order----------");
		intsList.stream().distinct().sorted(Collections.reverseOrder()).forEach(System.out::println);
		System.out.println("-------with ascending order----------");
		intsList.stream().distinct().sorted().forEach(System.out::println);

		Set<Integer> intsSet = new HashSet<Integer>();
		intsList.stream().filter(n -> !intsSet.add(n)).collect(Collectors.toSet());
		System.out.println(intsSet);
	}

}
