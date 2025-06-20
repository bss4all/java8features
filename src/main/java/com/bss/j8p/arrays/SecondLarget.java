package com.bss.j8p.arrays;

public class SecondLarget {

	public static void main(String[] args) {
		int[] nums = { 10, 8, 5, 15, 20, 11 };
		int temp = 0;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] < nums[j]) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		System.out.println(nums[1]);

		int largestNum = Integer.MIN_VALUE;
		int secondNum = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > largestNum) {
				secondNum = largestNum;
				largestNum = nums[i];
			} else if (nums[i] > secondNum && nums[i] != largestNum) {
				secondNum = nums[i];
			}
		}
		System.out.println(largestNum);
		System.out.println(secondNum);
	}

}
