## Team Challenge - LeetCode Problems

### Overview

This repository contains solutions to five different LeetCode problems that were collaboratively solved by our team. Each problem involves algorithmic challenges designed to improve problem-solving, coding efficiency, and collaboration skills. Below, you will find a summary of each project, the approach taken, pseudocode, and instructions on how to use the implemented solutions.

### 1. Average Salary Excluding the Minimum and Maximum Salary

Calculate the average salary of employees, excluding the minimum and maximum salaries from the given list of unique integers.

- Key Features:

  - Handles edge cases where salaries are few.
  - Implements an efficient iteration mechanism to find min and max values and calculate the adjusted sum.

- Approach
  - Calculate the total sum of salaries.
  - Identify and exclude the minimum and maximum salaries.
  - Compute the average from the remaining salaries.

#### Example:

Input:  
`salary = [4000, 3000, 1000, 2000]`

Output:  
`2500.00000`

Explanation:

- Minimum salary: 1000
- Maximum salary: 4000
- Remaining salaries: `[3000, 2000]`
- Average = (3000 + 2000) / 2 = 2500

#### How It Works:

1. Traverse the array to find the minimum and maximum values.
2. Add all salaries to compute the total sum.
3. Exclude the minimum and maximum from the sum.
4. Divide the adjusted sum by the number of remaining elements (`length - 2`).

### 2. Squares of a Sorted Array

Return the squares of a sorted array in non-decreasing order.

- Key Features:
  - Efficiently squares and sorts elements using the two-pointer technique.
  - Optimized for arrays containing both positive and negative integers.
- Approach:
  - Use two pointers to compare squares of numbers at the array's ends.
  - Populate the result array starting from the largest square.

#### Example:

Input:  
`nums = [-4, -1, 0, 3, 10]`

Output:  
`[0, 1, 9, 16, 100]`

Explanation:

- Squares: `[16, 1, 0, 9, 100]`
- Sorted squares: `[0, 1, 9, 16, 100]`

#### How It Works:

1. Start with two pointers: one at the beginning and one at the end of the array.
2. Compare the absolute values of the elements at the pointers.
3. Place the larger square at the current position in the result array.
4. Move the pointer inward for the larger value and repeat until all elements are processed.

### 3. Missing Number

Find the missing number in a sequence from 0 to n in an array of distinct integers.

- Key Features:
  - Uses arithmetic sum formula for an efficient solution.
  - Handles large arrays without requiring extra space.
- Approach:
  - Calculate the expected sum of numbers from 0 to n.
  - Subtract the actual sum of array elements from the expected sum.

#### Example:

Input:  
`nums = [3, 0, 1]`

Output:  
`2`

Explanation:

- Sequence: `0, 1, 2, 3`
- Expected sum: `0 + 1 + 2 + 3 = 6`
- Actual sum: `3 + 0 + 1 = 4`
- Missing number: `6 - 4 = 2`

#### How It Works:

1. Compute the total sum of numbers from 0 to n using the formula: \( n imes (n + 1) / 2 \).
2. Compute the sum of elements in the input array.
3. Subtract the actual sum from the expected sum to find the missing number.

### 4. Add Two Numbers

Add two non-negative integers represented as linked lists, where digits are stored in reverse order. Return the sum as a linked list.

- Key Features:

  - Handles lists of different lengths.
  - Supports carry-over for sums exceeding 9.

- Approach:
  - Iterate through both lists, adding corresponding digits and managing carry.
  - Create nodes dynamically to represent the sum in reverse order.

#### Example:

Input:  
`l1 = [2, 4, 3], l2 = [5, 6, 4]`

Output:  
`[7, 0, 8]`

Explanation:

- Reverse order: `342 + 465 = 807`
- Linked list representation: `[7, 0, 8]`

#### How It Works:

1. Traverse both lists simultaneously.
2. Add corresponding digits from the two lists and include any carry from the previous addition.
3. If the sum exceeds 9, carry the tens digit to the next node.
4. Repeat until both lists are processed and the carry is zero.

### 5. Merge Two Sorted Lists

Merge two sorted linked lists into a single sorted list while preserving the order.

- Key Features:

  - Efficiently traverses and merges both lists.
  - Handles cases where one list is empty.

- Approach:
  - Use a dummy node to simplify the merge process.
  - Compare nodes from both lists and append the smaller value to the merged list.
  - Attach remaining nodes from the non-empty list.

#### Example:

Input:  
`list1 = [1, 2, 4], list2 = [1, 3, 4]`

Output:  
`[1, 1, 2, 3, 4, 4]`

Explanation:

- Compare the first elements of both lists: 1 and 1. Append one 1 to the merged list.
- Continue comparing: 2 and 3 → append 2, then append 3, and so on.
- Combine the lists in sorted order: `[1, 1, 2, 3, 4, 4]`.

#### How It Works:

1. Initialize a dummy node to act as the head of the merged list.
2. Traverse both lists, appending the smaller node to the merged list.
3. If one list is exhausted, append the remaining nodes from the other list.
4. Return the merged list starting from the dummy’s next node.

### How to Use This Repository

Clone the Repository:

```bash
git clone https://github.com/your-repo/leetcode-challenges.git
cd leetcode-challenges
```

Run Each Solution:

- Import the Java files into your preferred IDE.
- Execute the main method in each project to test the solutions.

### Authors and Contributors

Team Members:

- Getenesh Guta
- Moti Kedida
- Nana Nsiah
