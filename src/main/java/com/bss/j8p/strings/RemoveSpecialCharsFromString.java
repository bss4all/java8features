package com.bss.j8p.strings;

public class RemoveSpecialCharsFromString {

	public static void main(String[] args) {
		String name = "B. Sudhamsh Kumar";
		System.out.println(name.replaceAll("[^a-zA-Z0-9]", ""));
	}

}
