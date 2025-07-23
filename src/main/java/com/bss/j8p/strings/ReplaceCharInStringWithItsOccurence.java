package com.bss.j8p.strings;

public class ReplaceCharInStringWithItsOccurence {

	public static void main(String[] args) {
		String name = "Biruduraju Sudhamsh Kumar";
		char char2Replace = 'u';

		if (name.indexOf(char2Replace) == -1) {
			System.out.println("Not present");
			System.exit(0);
		}

//		char[] charArr = name.toCharArray();
		int count = 1;
//		for(int i = 0 ; i < name.length() - 1 ; i++ ) {
//			if (charArr[i] == char2Replace) {
//				charArr[i] = String.valueOf(count).charAt(0);
//				count++;
//			}
//		}
//		System.out.println(Arrays.toString(charArr));

		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (ch == char2Replace) {
				name = name.replaceFirst(String.valueOf(char2Replace), String.valueOf(count));
				count++;
			}
		}
		System.out.println(name);
	}

}
