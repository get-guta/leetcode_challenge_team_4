package com.bptn.leetcode_challenge_team_4.challege1;

public class Solution {
    public static void main(String[] args) {
        double ret;
        int[] salary = {4000, 3000, 1000, 2000};
        ret = new Solution().average(salary);
        System.out.println(ret);

        int[] salary1 = {1000,2000,3000};
        ret = new Solution().average(salary1);
        System.out.println(ret);
    }
    public double average(int[] salary) {
        //minSalary starts as the largest possible integer (Integer.MAX_VALUE)
        // so that it gets updated with the smallest value in the array.
        int minSalary = Integer.MAX_VALUE;
        //maxSalary starts as the smallest possible integer (Integer.MIN_VALUE)
        // so that it gets updated with the largest value in the array.
        int maxSalary = Integer.MIN_VALUE;
        int totalSum = 0;

        // Iterate through the array to find min, max, and calculate total sum
        for (int sal : salary) {
        // We update the minimum salary (sal) if it is less than the current minSalary. minSalary is updated to sal.
            if (sal < minSalary) {
                minSalary = sal;
            }
        // We update the maximum salary (sal) If it is greater than the current maxSalary. maxSalary is updated to sal.
            if (sal > maxSalary) {
                maxSalary = sal;
            }
            // Add the current salary to the total sum
            totalSum += sal;
        }
        //The minSalary and maxSalary are subtracted from the totalSum to exclude them.
        totalSum -= minSalary + maxSalary;
        //The remaining sum (totalSum) is divided by the number of elements excluding the two extremes points (salary.length - 2).
        //The result is cast to double to ensure the average includes decimal values.
        return (double) totalSum / (salary.length -2);
    }
}
// minSalary and maxSalary track the smallest and largest salaries.
// totalSum accumulates the sum of all salaries.
// A for-each loop is used to traverse the salary array.
// During each iteration, we update the minimum and maximum salaries and add the current salary to totalSum.
// After the loop, subtract the minSalary and maxSalary from totalSum.
// Divide the adjusted sum by salary.length - 2 to account for excluding the two extreme salaries.

