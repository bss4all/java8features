package com.bss.j8p.strings;

public class RemoveAdjacentDuplicates {

	public static void main(String[] args) {
		String input = "azxxzy";
		System.out.println(removeDuplicates(input)); // Output: "ay"
	}
	
	private static String removeDuplicates1(String input) {
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == c) {
                sb.deleteCharAt(sb.length() - 1); // Remove last character
            } else {
                sb.append(c); // Add current character
            }
        }
        return sb.toString();
    }

	private static String removeDuplicates(String input) {
		StringBuilder sb = new StringBuilder();
		for (char c : input.toCharArray()) {
			if (sb.length() > 0 && sb.charAt(sb.length() - 1) == c) {
				sb.deleteCharAt(sb.length() - 1); // Remove last character
			} else {
				sb.append(c); // Add current character
			}
		}
		return sb.toString();
	}

}
