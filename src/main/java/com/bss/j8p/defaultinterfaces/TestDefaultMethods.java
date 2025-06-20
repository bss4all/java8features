package com.bss.j8p.defaultinterfaces;

interface MyInterface {
	default void showMyName() {
		System.out.println("MyInterface");
	}

	void displayName();
}

interface MyInterface1 {
	default void showMyName() {
		System.out.println("MyInterface1");
	}

	void displayName();
}

public class TestDefaultMethods implements MyInterface, MyInterface1 {

	public static void main(String[] args) {
		TestDefaultMethods tdm = new TestDefaultMethods();
		tdm.showMyName();
	}

	@Override
	public void displayName() {
		System.out.println("TestDefaultMethods");
	}

	public void showMyName() {
		// MyInterface.super.showMyName();
		// MyInterface1.super.showMyName();
		System.out.println("TestDefaultMethods");
	}

}
