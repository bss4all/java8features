package com.bss.j8p.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedCharacterInString {

	public static void main(String[] args) {
		String name = "Biruduraju Sudhamsh Kumar";

		System.out.println("1 - without collections");

		for (int i = 0; i < name.length(); i++) {
			boolean unique = true;
			for (int j = 0; j < name.length(); j++) {
				if (i != j && name.charAt(i) == name.charAt(j)) {
					unique = false;
					break;
				}
			}
			if (unique) {
				System.out.println(name.charAt(i));
				break;
			}
		}

		System.out.println("2 - with collections");
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (charMap.containsKey(ch)) {
				int count = charMap.get(ch);
				charMap.put(ch, count + 1);
			} else {
				charMap.put(ch, 1);
			}
		}
		for (Entry<Character, Integer> entrySet : charMap.entrySet()) {
			if (entrySet.getValue() == 1) {
				System.out.println(entrySet.getKey());
				break;
			}
		}
	}

}
