package com.bss.j8p.strings;

import java.util.HashMap;
import java.util.Map;

public class MinMaxCharCount {

	public static void main(String[] args) {
		String name = "BirudurajuSudhamshKumar";

		char[] cArray = name.toCharArray();
		int freq[] = new int[cArray.length];
		int min = 0, max = 0;
		char minChar = cArray[0], maxChar = cArray[0];

		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		/*
		 * for (int i =0; i<cArray.length; i++) { if (charMap.containsKey(cArray[i])) {
		 * charMap.put(cArray[i], charMap.get(cArray[i])+1); } else {
		 * charMap.put(cArray[i], 1); } } System.out.println(charMap);
		 */

		for (int i = 0; i < cArray.length; i++) {
			freq[i] = 1;
			for (int j = i + 1; j < cArray.length; j++) {
				if (cArray[i] == cArray[j] && cArray[i] != '0') {
					freq[i]++;
					cArray[j] = '0';
				}
			}
		}
		for (int k = 0; k < freq.length; k++) {
			// System.out.println(k+"----"+freq[k]+"-----"+cArray[k]);
			if (min > freq[k] && freq[k] != '0') {
				min = freq[k];
				minChar = cArray[k];
			}
			if (max < freq[k] && freq[k] != '0') {
				max = freq[k];
				maxChar = cArray[k];
			}
		}
		System.out.println(minChar);
		System.out.println(maxChar);
	}

}
