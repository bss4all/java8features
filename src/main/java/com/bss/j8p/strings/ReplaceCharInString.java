package com.bss.j8p.strings;

public class ReplaceCharInString {

	public static void main(String[] args) {
		String name = "BirudarajuSudhamshKumar";
		char[] cArray = name.toCharArray();
		for (int i = 0; i < cArray.length; i++) {
			if (Character.isUpperCase(cArray[i])) {
				// for showing space
				// cArray[i] = 0;

				// convert to lowercase
				cArray[i] = Character.toLowerCase(cArray[i]);
			}
		}
		String str = new String(cArray);
		System.out.println(str);
	}

}
