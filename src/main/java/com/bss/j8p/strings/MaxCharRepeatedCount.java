package com.bss.j8p.strings;

public class MaxCharRepeatedCount {
	public static void main(String[] args) {
		String name = "Biruduraju Sudhamsh Kumar B";

		int[] arr = new int[127];

		for (int i = 0; i < name.length(); i++) {
			arr[name.charAt(i)] = arr[name.charAt(i)] + 1;
		}
		int max = -1;
		int min = arr[name.charAt(0)];
		char c = ' ';
		char m = name.charAt(0);

		for (int i = 0; i < name.length(); i++) {
			if (max < arr[name.charAt(i)]) {
				max = arr[name.charAt(i)];
				c = name.charAt(i);
			}
			if (min > arr[name.charAt(i)]) {
				min = arr[name.charAt(i)];
				m = name.charAt(i);
			}

		}
		System.out.println(max + "-max---------char-" + c);
		System.out.println(min + "-min---------char-" + m);

//		for(int j =0; j<arr.length;j++) {
//			System.out.println(j+"-------------"+arr[j]);
//		}
	}
}
