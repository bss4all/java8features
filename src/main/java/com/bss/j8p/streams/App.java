package com.bss.j8p.streams;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		var set1 = Set.of("a", "b", "c", "d");

		var stream1 = set1.stream();

		stream1.forEach(System.out::println);

		Arrays.asList("aaa", "bbb", "ccc", "ddd").stream().forEach(System.out::println);

		Stream.Builder<Double> builder = Stream.builder();
		builder.accept(1.0);
		builder.accept(2.0);
		builder.accept(3.0);
		builder.accept(4.0);
		builder.accept(5.0);
		builder.add(6.0);
		Stream<Double> stream2 = builder.build();

		stream2.forEach(System.out::println);

		IntStream.range(1, 10).filter(i -> i % 2 == 0).forEach(System.out::println);

		IntStream.iterate(0, a -> a < 1000, a -> a + 10).forEach(System.out::println);

		IntStream.iterate(0, a -> a + 2).takeWhile(a -> a < 20).forEach(System.out::println);
		Stream.iterate("a", a -> a + "a").takeWhile(a -> a.length() < 6).forEach(System.out::println);

		// IntStream.iterate(0, a -> a + 10).dropWhile(a -> a < 20).forEach(System.out::println);

	}

}
