package com.bss.j8p.numbers;

public class FibonacciNumbers {

	public static void main(String[] args) {
		//Print N Fibnoacci Numbers
		int a = 0, b= 1, sum = 0, count = 2;
		System.out.println(a);
		System.out.println(b);
		while (count < 10) {
			sum = a+b;
			a = b;
			b = sum;
			System.out.println(sum);
			count++;
		}
	}
	

}
