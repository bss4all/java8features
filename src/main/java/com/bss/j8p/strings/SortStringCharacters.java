package com.bss.j8p.strings;

import java.util.Arrays;

public class SortStringCharacters {

	public static void main(String[] args) {
		String name = "sudhamsh";
		System.out.println(name);
		char[] charArr = name.toCharArray();

		char temp;

		for (int i = 0; i < charArr.length; i++) {
			for (int j = i + 1; j < charArr.length; j++) {
				if (charArr[i] > charArr[j]) {
					temp = charArr[i];
					charArr[i] = charArr[j];
					charArr[j] = temp;
				}
			}

		}

		System.out.println(new String(charArr));

		String str = "Biruduraju";
		char[] charArr1 = str.toCharArray();
		Arrays.sort(charArr1);
		System.out.println(new String(charArr1));

	}

}
