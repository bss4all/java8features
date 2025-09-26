package com.bss.j8p.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordGenerator {

	public static void main(String[] args) {
		String name = "kakatiya";
		char[] nameChars = name.toCharArray();
		Set<Character> nameCharSet = new HashSet<Character>();
		
		for(int i = 0; i< nameChars.length; i++) {
			nameCharSet.add(nameChars[i]);
		}
		System.out.println(nameCharSet);

		//find unique chars from word.

		//List<Character> chars = Arrays.asList('a', 'b', 'c', 'd');
		List<Character> chars = new ArrayList<>(nameCharSet);
		
		
        int targetLength = 5; // Change this to generate words of any length
        generateWords(chars, "", targetLength);
	}
	
	static void generateWords(List<Character> chars, String current, int targetLength) {
        if (current.length() == targetLength) {
            System.out.println(current); // Print only when desired length is reached
            return;
        }

        for (int i = 0; i < chars.size(); i++) {
            List<Character> remaining = new ArrayList<>(chars);
            char ch = remaining.remove(i);
            generateWords(remaining, current + ch, targetLength);
        }
    }

}
