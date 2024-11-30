package com.bptn.leetcode_challenge_team_4.challenge4;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //firstNode: A placeholder/dummy node to simplify the process of handling the head node.
        ListNode firstNode = new ListNode();
        //set to firstNode, and tracks the current node in the result list.
        ListNode currentNode = firstNode;
        //stores the carry-over value when the sum of two digits exceeds 9.
        int carry = 0;
        //This loop iterates through both linked lists as long as both are not null.
        while (l1 != null && l2 != null) {
            currentNode.next = new ListNode(carry); // Create a new node (currentNode.next) to hold the result of the addition
            currentNode = currentNode.next; // Update the currentNode to point to the newly created node
            carry = addTwoNumbers(l1, l2, currentNode); // Calculate the new carry and update it for the next iteration.
            //Move to the next nodes in both l1 and l2
            l1 = l1.next;
            l2 = l2.next;
        }
        //If one list is longer than the other, process the remaining nodes of the longer list (l1 or l2).
        //The code checks which list is not null
        // We assume that the list are not the same length
        ListNode node = l1;
        if (l1 == null) {
            node = l2;
        }
        // Use the addCarry helper method to add the remaining digits and manage the carry.
        //continues adding those values with the carry until the list is exhausted.
        while (node != null) {
            currentNode.next = new ListNode();
            currentNode = currentNode.next;
            carry = addCarry(node.val, carry, currentNode); //The addCarry method is used to add any remaining nodes.
            node = node.next;
        }
        // a new node is created with the carry value if there's anything left after all node (this is done after both lists are exhausted).
        if (carry == 1) {
            currentNode.next = new ListNode(carry);
        }
        // The method returns the result starting from firstNode.next (skipping the dummy node).
        return firstNode.next;
    }

    public int addCarry(int val, int carry, ListNode outNode) {
        // Adds a single value (val) and the current carry to a result outNode
        int sum = outNode.val + val + carry;
        outNode.val = sum%10; // Updates outNode with the last digit of the sum (sum % 10).
        // if sum is 10 or greater, there is a carry to the next digit,
        // so the method returns 1. Otherwise, it returns 0.
        if (sum >= 10) {
            return 1;
        } else {
            return 0;
        }
    }
    // similar to the addCarry method,  but it takes two nodes (l1 and l2) from the two linked lists
    // and adds their values with the carry to the outNode.
    public int addTwoNumbers(ListNode l1, ListNode l2, ListNode outNode) {
       // Adds the current digits from l1 and l2 and the carry from outNode.val.
        int sum = outNode.val + l1.val + l2.val;
        outNode.val = sum%10; // Updates the value in outNode
        //If sum is 10 or greater, the carry is set to 1. Otherwise, it is 0.
        if (sum >= 10) {
            return 1;
        } else {
            return 0;
        }
    }
}
// We build a new linked list by continuously adding new nodes that represent the result of adding corresponding digits.
// Just like  how you would manually add numbers with carries in elementary school,
// the code keeps track of any carry during each step and ensures it’s applied to the next digit.
// addCarry and addTwoNumbers are helper methods that encapsulate the logic of adding two numbers and updating the carry