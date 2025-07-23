package com.bss.j8p.streams;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStream {
    public static void main(String[] args) {
        IntStream.range(1, 100)
                .parallel()
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);
        System.out.println("-------------------");

        IntStream.range(1, 5)
                .parallel()
                .peek(System.out::print)
                .forEach(System.out::print);
        System.out.println("-------------------");
        List.of("one", "two", "three", "four", "five")
                .parallelStream()
                .forEach(System.out::println);

    }
}
