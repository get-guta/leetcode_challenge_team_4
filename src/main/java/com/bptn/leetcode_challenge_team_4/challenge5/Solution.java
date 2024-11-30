package com.bptn.leetcode_challenge_team_4.challenge5;

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
    // The method returns a new linked list that merges list1 and list2 in sorted order.
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //dummy node (firstNode) placeholder for the head of the merged list.
        ListNode firstNode = new ListNode();
        // pointer outNode to traverse and build the merged list starting from the dummy node.
        ListNode outNode = firstNode;
        // Loops as long as both list1 and list2 still have elements in both to compare and merge.
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) { //Checks if the value of the current node in list1 is less than or equal to the value of the current node in list2
                outNode.next = list1; // Assigns list1 to outNode.next. Adds list1's node to the merged list.
                list1 = list1.next; // Then moves l1 to the next node
            } else {
                outNode.next = list2; //Assigns list2 to outNode.next. Adds list2's node to the merged list.
                list2 = list2.next; // Then moves l1 to the next node
            }
            outNode = outNode.next; // Advances the outNode pointer to the next node in the merged list.
        }
        // After the loop checks if list1 or list2 may still have nodes left
        if (list1 == null) {
            outNode.next = list2;
        } else {
            outNode.next = list1;
        }
       // Returns the merged list starting from the node after the dummy node
        return firstNode.next;
    }
}
