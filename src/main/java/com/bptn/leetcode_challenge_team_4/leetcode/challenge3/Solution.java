package com.bptn.leetcode_challenge_team_4.leetcode.challenge3;

public class Solution {

	public Solution() {

	}

	public static void main(String[] args) {
		int[] nums1 = { 3, 0, 1 };
		Solution mn = new Solution();
		int ret;
		ret = Solution.missingNumber(nums1);
		System.out.println(ret); // Output: 2

		int[] nums2 = { 0, 1 };
		ret = Solution.missingNumber(nums2);
		System.out.println(ret); // Output: 2

		int[] nums3 = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		ret = Solution.missingNumber(nums3);
		System.out.println(ret); // Output: 2
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
