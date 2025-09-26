package com.bss.j8p.strings;

import java.util.StringJoiner;

public class StringJoinerEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner joiner = new StringJoiner(", ");
        joiner.add("Apple");
        joiner.add("Banana");
        joiner.add("Cherry");
        joiner.add("Peers");
        joiner.add("Orange");

        System.out.println(joiner.toString()); // Output: Apple, Banana, Cherry
        
        
        StringJoiner joiner1 = new StringJoiner(" - ", "(", "}");
        joiner1.add("Red").add("Green").add("Blue");

        System.out.println(joiner1); // Output: [Red, Green, Blue]
        
        joiner.merge(joiner1);
        System.out.println(joiner); // Output: One, Two, Three - Four
        
        System.out.println(joiner.length());
        System.out.println(joiner.toString());


	}

}
