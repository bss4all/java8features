package com.bss.j8p.strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsJoiningEg {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java", "Stream", "Collectors");

        String result = words.stream()
                             .collect(Collectors.joining());

        System.out.println(result); // Output: JavaStreamCollectors
        
        result = words.stream()
                .collect(Collectors.joining(", "));

        System.out.println(result);
        
        result = words.stream()
                .collect(Collectors.joining(", ", "[", "]"));
        
        System.out.println(result);

	}

}
