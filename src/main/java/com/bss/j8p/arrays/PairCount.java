package com.bss.j8p.arrays;

public class PairCount {

	public static void main(String[] args) {
		int[] A = { 1, 5, 3, 4, 2 };
		int B = 2;
		int count = 0;
		
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				if (i != j && A[i] - A[j] == B) {
					count++;
				}
			}
		}
		
		System.out.println(count);
	}

}
