package Leetcode_questions.linked_list.q1;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        // Initialize two pointers: slow and fast
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;  // To keep track of the node before the middle node

        // Traverse the list with fast moving 2 steps and slow moving 1 step
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Delete the middle node by skipping it
        prev.next = slow.next;

        // Return the modified list
        return head;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = new ListNode(1);
    }
}
