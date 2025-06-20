package com.bss.j8p.strings;

public class RemoveWhiteSpacesInsideString {

	public static void main(String[] args) {
		String name = "Biruduraju  Sudhamsh  Kumar";
		System.out.println(name);
		name.replaceAll("\\s", "");
		System.out.println(name.replaceAll("\\s", ""));

	}

}
