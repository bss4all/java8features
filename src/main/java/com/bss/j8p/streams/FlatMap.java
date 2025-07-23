package com.bss.j8p.streams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMap {

	public static void main(String[] args) {
		String str = """
				one, two, three
				four, five, six
				seven, eight, nine
				""";
		Stream.of(str)
				.flatMap(line -> Stream.of(line.split(", ")))
				.map(String::trim)
				.forEach(System.out::println);

		int[][] numbers = {
				{ 1, 2, 3 },
				{ 4, 5, 6 },
				{ 7, 8, 9, 10 }
		};
		Stream.of(numbers)
				.flatMapToInt(IntStream::of)
				.forEach(System.out::println);
		System.out.println();
		Stream.of(numbers)
				.flatMapToInt(IntStream::of)
				.mapToDouble(d -> (double) d)
				.forEach(System.out::println);

	}

}
