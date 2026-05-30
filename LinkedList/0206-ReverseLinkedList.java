/*
 * Problem: 206. Reverse Linked List
 * Link: https://leetcode.com/problems/reverse-linked-list/
 * Difficulty: Easy
 * Topic: Linked List, Two Pointers
 * 
 * Approach:
 * - Use two pointers: prev (starts as null) and curr (starts at head)
 * - For each node, store the next node before reversing the pointer
 * - Reverse curr.next to point to prev
 * - Move prev and curr one step forward
 * - When curr becomes null, prev holds the new head
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
}
