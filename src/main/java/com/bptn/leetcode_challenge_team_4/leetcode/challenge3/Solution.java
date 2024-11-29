package com.bptn.leetcode_challenge_team_4.leetcode.challenge3;

public class Solution {

	public Solution() {

	}

	public static void main(String[] args) {

		// Example 1: Input array has numbers [3, 0, 1]
		// Missing number is 2
		int[] nums1 = { 3, 0, 1 };
		int ret;
		ret = Solution.missingNumber(nums1);
		System.out.println(ret);

		// Example 2: Input array has numbers [0, 1]
		// Missing number is 2

		int[] nums2 = { 0, 1 };
		ret = Solution.missingNumber(nums2);
		System.out.println(ret);

		// Example 3: Input array has numbers [9, 6, 4, 2, 3, 5, 7, 0, 1]
		// Missing number is 8
		int[] nums3 = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		ret = Solution.missingNumber(nums3);
		System.out.println(ret);
	}

	public static int missingNumber(int[] nums) {

		int n = nums.length;
		// Calculate the expected sum of numbers from 0 to n
		int expectedSum = n * (n + 1) / 2;
		int actualSum = 0;
		// Calculate the actual sum of numbers in the array
		for (int num : nums) {
			actualSum += num;
		}
		// Return the difference between expected and actual sum, which is the missing
		// number
		return expectedSum - actualSum;
	}

}

/*
 * This code code implements a solution to find the missing number in a sequence
 * from 0 to n in an integer array where exactly one number is missing. To do
 * that we calculate the expected sum of the first n natural numbers using
 * expectedSum = n * (n + 1) / 2 formula. We also calculate actual sum of a
 * numbers in the array and subtract the actual sum from the expected sum, the
 * difference is the missing number.
 * 
 */
