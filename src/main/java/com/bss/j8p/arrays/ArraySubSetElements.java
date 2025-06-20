package com.bss.j8p.arrays;

// PROGRAM - find integers whose sum equal to target integer from array of integers.
public class ArraySubSetElements {
	public static void main(String[] args) {
		System.out.println("START");
		int[] numbs = { 9, 0, 6, 1, 2, 7, 5, 3 };
		for (int i = 0; i < numbs.length; i++) {
			System.out.print(numbs[i] + " ");
		}
		System.out.println();
		int target = 15, sum = 0;
		for (int i = 0; i < numbs.length; i++) {
			for (int j = i + 1; j < numbs.length; j++) {
				for (int k = j; k < numbs.length; k++) {
					sum = sum + numbs[i] + numbs[j] + numbs[k];
					// System.out.println(sum);
					if (sum == target) {
						// System.out.println("inside");
						System.out.println("{ " + numbs[i] + ", " + numbs[j] + ", " + numbs[k] + " }");
					}
				}
				sum = 0;
			}
			sum = 0;
		}
		System.out.println("END");
	}

}
