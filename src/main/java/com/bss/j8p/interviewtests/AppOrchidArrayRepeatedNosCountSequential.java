package com.bss.j8p.interviewtests;

public class AppOrchidArrayRepeatedNosCountSequential {

	public static void main(String[] args) {
		int nums[] = { 1, 1, 3, 3, 3, 3, 3, 2, 4, 4, 6, 6, 9, 1, 1, 2, 2, 2, 2 };

		int count = 1;
		int temp = 0;
		boolean endFlag = false;
		// System.out.println(nums.length);
		for (int i = 0; i < nums.length; i++) {
			// System.out.println("i is "+i);
			count = 1;
			temp = nums[i];
			for (int j = i + 1; j < nums.length; j++) {
				if (temp == nums[j]) {
					count++;
					if (j == (nums.length - 1)) {
						endFlag = true;
					}
				} else {
					i = j - 1;
					break;
				}
			}
			System.out.println(temp + " count is " + count);
			if (endFlag)
				break;
		}

	}

}
