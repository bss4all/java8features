package com.bss.j8p.strings;

public class TeehMStringArrayTokenCount {

	public static void main(String[] args) {

		System.out.println(20 / 10 % 2);

		A a = new A();
		a.m2();

		String str = "This is a line";
		String[] strArr = str.split(" ");
		System.out.println(strArr.length);

		boolean t = true;
		System.out.println("Hello");

		if (t)
			return;

		System.out.println("Bye");
	}

}

interface I1 {
	void m1();
}

interface I2 {
	void m2();
}

class A implements I1, I2 {
	public void m1() {
		System.out.println("m1");
	}

	public void m2() {
		System.out.println("m2");
	}
}
