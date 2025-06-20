package com.bss.j8p.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeatingChar {

	public static void main(String[] args) {
		String name = "birudurajusudhamshkumar";

		String longestSubString = "";

		int longestSubStringLength = 0;

		Map<Character, Integer> subStrMap = new LinkedHashMap<Character, Integer>();

		char[] charArray = name.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			// System.out.println(i+"-i-charArray-"+charArray[i]);
			if (!subStrMap.containsKey(name.charAt(i))) {
				subStrMap.put(charArray[i], i);
			} else {
				i = subStrMap.get(charArray[i]);
				subStrMap.clear();
			}
		}
		if (subStrMap.size() > longestSubStringLength) {
			longestSubStringLength = subStrMap.size();
			longestSubString = subStrMap.keySet().toString();
		}

		System.out.println("longestSubString = " + longestSubString);
		System.out.println("longestSubStringLength = " + longestSubStringLength);

	}

}
