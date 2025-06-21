package com.bss.j8p.arrays;

public class DisplayDuplicate {

	public static void main(String[] args) {
		System.out.println("START");
		// Program to display duplicate elements in an array
		// using nested for loop
		// and set the duplicate element to zero.
	    // This will display the duplicate elements only once.
		System.out.println("1 - By Using Nested For Loop");
		int[] arr = { 100, 187, 67, 100, 67, 1, 100 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (i != j && arr[i] == arr[j] && arr[j] != 0) {
					System.out.println(arr[i]);
					arr[j] = 0;
				}
			}
		}
		System.out.println("2 - By Using Nested For Loop and Set");
		// Program to display duplicate elements in an array
		// using nested for loop and set the duplicate element to zero.
		int[] arr1 = { 100, 187, 67, 100, 67, 1, 100 };
		for (int i = 0; i < arr1.length; i++) {
			boolean repeatedFlag = false;
			for (int j = i + 1; j < arr1.length; j++) {
				if (arr1[i] == arr1[j] && arr1[j] != 0) {
					repeatedFlag = true;
					arr1[j] = 0;
				}
			}
			if (repeatedFlag) {
				System.out.println(arr1[i]);
			}
		}
		
		System.out.println("3 - By Using Set");
		// Program to display duplicate elements in an array
		// using set
		int[] arr2 = { 100, 187, 67, 100, 67, 1, 100 };
		java.util.Set<Integer> set = new java.util.HashSet<>();
		for (int i = 0; i < arr2.length; i++) {
			if (!set.add(arr2[i])) {
				System.out.println(arr2[i]);
			}
		}
		System.out.println("4 - By Using Java 8 Streams");
		// Program to display duplicate elements in an array
		// using Java 8 Streams
		int[] arr3 = { 100, 187, 67, 100, 67, 1, 100 };
		java.util.Arrays.stream(arr3).filter(i -> java.util.Arrays.stream(arr3).filter(j -> j == i).count() > 1)
				.distinct().forEach(System.out::println);
		
		System.out.println("5 - By Using Java 8 Streams and Collectors");
		// Program to display duplicate elements in an array
		// using Java 8 Streams and Collectors
		int[] arr4 = { 100, 187, 67, 100, 67, 1, 100 };
		java.util.Map<Integer, Long> duplicates = java.util.Arrays.stream(arr4).boxed()
				.collect(java.util.stream.Collectors.groupingBy(i -> i, java.util.stream.Collectors.counting()));
		duplicates.entrySet().stream().filter(entry -> entry.getValue() > 1).forEach(entry -> {
			System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");
		});
		System.out.println("Duplicates displayed above.");
		System.out.println("END");
		
	}

}
