package com.bss.j8p.streams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Reduce {
    public static void main(String[] args) {
        String str = """
                one, two, three
                four, five, six
                seven, eight, nine
                """;
        Stream.of(str)
                .flatMap(line -> Stream.of(line.split(", ")))
                .map(String::trim)
                .reduce((s1, s2) -> s1 + ", " + s2)
                .ifPresent(System.out::println);

        int[][] numbers = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9, 10 }
        };
        int sum = Stream.of(numbers)
                .flatMapToInt(IntStream::of)
                .reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);

        double[] doubleNumbers = { 1.0, 2.0, 3.0, 4.0, 5.0 };
        var result = DoubleStream.of(doubleNumbers).count();
        System.out.println("Count of double numbers: " + result);

        var average = DoubleStream.of(doubleNumbers).average();
        average.ifPresent(avg -> System.out.println("Average: " + avg));

        var sum1 = DoubleStream.of(doubleNumbers).sum();
        System.out.println("Sum of double numbers: " + sum1);

        var min = DoubleStream.of(doubleNumbers).min();
        min.ifPresent(minValue -> System.out.println("Min: " + minValue));

        var max = DoubleStream.of(doubleNumbers).max();
        max.ifPresent(maxValue -> System.out.println("Max: " + maxValue));

        var product = DoubleStream.of(doubleNumbers).reduce(1.0, (a, b) -> a * b);
        System.out.println("Product: " + product);

        var concatenated = Stream.of("Hello", "Java8", "World")
                .reduce("", (s1, s2) -> s1 + " " + s2);
        System.out.println("Concatenated: " + concatenated);

    }
}
