package com.bss.j8p.strings;

public class ReverseString {

	// https://www.youtube.com/watch?v=RMRkK3rF1OU
	// - Top 10 String Interview Questions On Logical Programs - Explained Coding

	public static void main(String[] args) {
		String name = "BSudhamshKumar";

		System.out.println("START");
		char[] chars = name.toCharArray();
		System.out.println("1 - By Char Array");
		for (int i = chars.length - 1; i >= 0; i--) {
			System.out.print(chars[i]);
		}
		System.out.println();
		System.out.println("2 - By String charAt");
		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.print(name.charAt(i));
		}
		System.out.println();
		System.out.println("3 - By StringBuffer Reverse Method");
		StringBuffer sb = new StringBuffer(name);
		System.out.println(sb.reverse());
		System.out.println("4 - By StringBuilder Reverse Method");
		StringBuilder sbd = new StringBuilder(name);
		System.out.println(sbd.reverse());
		System.out.println("END");
	}

}
