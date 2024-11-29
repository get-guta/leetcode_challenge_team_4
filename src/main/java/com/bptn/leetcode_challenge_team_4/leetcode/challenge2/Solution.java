package com.bptn.leetcode_challenge_team_4.leetcode.challenge2;

import java.util.Arrays;

public class Solution {
    public int[] sortedSquares(int[] nums) {
    	
        int n = nums.length;  
        int[] result = new int[n];  // Array to store the sorted squares
        int left = 0, right = n - 1;  // Two pointers, one at the start, one at the end
        int index = n - 1;  // Start filling result array from the end

        //here we process the array until both pointers meet
        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            // Compare squares of both pointers
            if (leftSquare > rightSquare) {
                result[index--] = leftSquare;  // Place the larger square at the current position
                left++;  // Move left pointer to the right
            } else {
                result[index--] = rightSquare;  // Place the larger square at the current position
                right--;  // Move right pointer to the left
            }
        }
        return result;  // Return the result array with sorted squares
    }

    public static void main(String[] args) {
    	Solution solution = new Solution();

        int[] nums1 = {-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(solution.sortedSquares(nums1)));
       
        int[] nums2 = {-7, -3, 2, 3, 11};
        System.out.println(Arrays.toString(solution.sortedSquares(nums2)));
    }
}
