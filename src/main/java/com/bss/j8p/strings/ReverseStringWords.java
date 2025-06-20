package com.bss.j8p.strings;

public class ReverseStringWords {

	public static void main(String[] args) {
		String name = "Biruduraju Sudhamsh Kumar";
		String output = "";
		String[] words = name.split(" ");
		for (String word : words) {
			String reverseWord = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				reverseWord = reverseWord + word.charAt(i);
			}
			output = output + reverseWord + " ";
		}
		System.out.println(output);
	}

}
