package com.bss.j8p.arrays;

public class DisplayDuplicate {

	public static void main(String[] args) {
		int[] arr = { 100, 187, 67, 100, 67, 1, 100 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (i != j && arr[i] == arr[j] && arr[j] != 0) {
					System.out.println(arr[i]);
					arr[j] = 0;
				}
			}
		}
	}

}
