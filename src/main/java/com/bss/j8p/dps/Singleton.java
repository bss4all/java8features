package com.bss.j8p.dps;

public class Singleton {

	private static Singleton instance = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello World!");
	}

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		singleton.showMessage();
	}

}
