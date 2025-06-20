package com.bss.j8p.strings;

import java.util.HashMap;
import java.util.Map;

public class RepeatedCharCount {

	public static void main(String[] args) {
		String name = "Biruduraju Sudhamsh Kumar";
		Map<Character, Integer> charsCountMap = new HashMap<>();
		char[] charArr = name.toCharArray();
		for (int i = 0; i < charArr.length; i++) {
			if (charsCountMap.containsKey(charArr[i])) {
				int count = charsCountMap.get(charArr[i]);
				charsCountMap.put(charArr[i], count + 1);
			} else {
				charsCountMap.put(charArr[i], 1);
			}
		}
		System.out.println(charsCountMap);

		char ch = 'd';
		System.out.println(name.chars().filter(c -> c == ch).count());
	}

}
