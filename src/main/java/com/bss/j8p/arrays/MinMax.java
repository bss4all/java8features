package com.bss.j8p.arrays;

import java.util.Arrays;

public class MinMax {

	public static void main(String[] args) {
		int[] arr = { 7, 90, 45, 1, 7 };
		int min = arr[0], max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("min=" + min);
		System.out.println("max=" + max);

		Arrays.sort(arr);
		System.out.println("after sort min=" + arr[0]);
		System.out.println("after sort max=" + arr[arr.length - 1]);
	}

}
