package com.bss.j8p.optionals;

import java.util.Optional;

public class MethodsExample {

	public static void main(String[] args) {
		String[] words = new String[10];
		words[2] = "Word1 Word2";

		Optional<String> checkNull = Optional.ofNullable(words[5]);

		if (checkNull.isPresent()) {
			String word = words[5].toLowerCase();
			System.out.print(word);
		} else
			System.out.println("word is null");

		Optional<String> value = Optional.of(words[2]);

		System.out.println(value.get());

		System.out.println(value.isPresent());

		Optional<Integer> op = Optional.empty();
		System.out.println("Optional: " + op);

		System.out.println(op.orElse(1000));

		op.ifPresentOrElse((v) -> {
			System.out.println("Value Present");
		}, () -> {
			System.out.println("Value not present");
		});
	}

}
