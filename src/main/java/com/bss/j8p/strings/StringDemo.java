package com.bss.j8p.strings;

public class StringDemo {

	public static void main(String[] args) {
		String name = "BSudhamshKumar123";

		System.out.println("Insert space before Capital Letter");
		for (int i = 0; i < name.length(); i++) {
			if (i > 0 && Character.isUpperCase(name.charAt(i))) {
				System.out.print(" " + name.charAt(i));
			} else {
				System.out.print(name.charAt(i));
			}
		}

		System.out.println("\nReverse a String");
		for (int i = (name.length() - 1); i >= 0; i--) {
			System.out.print(name.charAt(i));
		}
		System.out.println("Capital Letters count");
		int capCount = 0, lowCount = 0, digitCount = 0;
		for (int i = 0; i < name.length(); i++) {
			if (Character.isUpperCase(name.charAt(i))) {
				++capCount;
			} else if (Character.isLowerCase(name.charAt(i))) {
				++lowCount;
			} else if (Character.isDigit(name.charAt(i))) {
				++digitCount;
			}
		}
		System.out.println("Capital letters count: " + capCount + ", Small letters Count :" + lowCount
				+ ", Numbers Count :" + digitCount);
	}

}
