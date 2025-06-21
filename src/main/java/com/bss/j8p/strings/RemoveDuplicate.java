package com.bss.j8p.strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String name = "bsudhamshkumar";
		System.out.println(name);
		System.out.println("1 - Java8 By Using StringBuilder");
		StringBuilder sb = new StringBuilder();
		name.chars().distinct().forEach(s -> sb.append((char) s));
		System.out.println(sb);

		System.out.println("2 - By Using String charAt() and indexOf() method");
		StringBuilder sb1 = new StringBuilder();
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			int ind = name.indexOf(ch, i + 1);
			if (ind == -1) {
				sb1.append(ch);
			}
		}
		System.out.println(sb1);

		System.out.println("3 - By Using String toCharArray() method");
		StringBuilder sb2 = new StringBuilder();
		char[] arr = name.toCharArray();
		for (int i = 0; i < name.length(); i++) {
			boolean repeatedFlag = false;
			for (int j = i + 1; j < name.length(); j++) {
				if (arr[i] == arr[j]) {
					repeatedFlag = true;
					break;
				}
			}
			if (!repeatedFlag) {
				sb2.append(arr[i]);
			}
		}
		System.out.println(sb2);

		System.out.println("4 - By Using Set");
		StringBuilder sb3 = new StringBuilder();
		Set<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < name.length(); i++) {
			set.add(name.charAt(i));
		}
		for (Character c : set) {
			sb3.append(c);
		}
		System.out.println(sb3);
		
		// remove duplicate characters from a string
		System.out.println("5 - By Using Regular Expression");
		String result = name.replaceAll("(.)\\1+", "$1");
		System.out.println(result);
		System.out.println("6 - By Using StringBuilder");
		StringBuilder sb4 = new StringBuilder();
		for (int i = 0; i < name.length(); i++) {
			if (i == 0 || name.charAt(i) != name.charAt(i - 1)) {
				sb4.append(name.charAt(i));
			}
		}
		System.out.println(sb4);
		System.out.println("7 - By Using StringBuilder and indexOf");
		StringBuilder sb5 = new StringBuilder();
		for (int i = 0; i < name.length(); i++) {
			if (i == 0 || name.charAt(i) != name.charAt(i - 1)) {
				sb5.append(name.charAt(i));
			} else if (name.indexOf(name.charAt(i), i + 1) == -1) {
				sb5.append(name.charAt(i));
			}
		}
		System.out.println(sb5);
		System.out.println("8 - By Using StringBuilder and indexOf with distinct");
		StringBuilder sb6 = new StringBuilder();
		name.chars().distinct().forEach(s -> {
			if (sb6.length() == 0 || sb6.charAt(sb6.length() - 1) != (char) s) {
				sb6.append((char) s);
			}
		});
		System.out.println(sb6);
	}

}
