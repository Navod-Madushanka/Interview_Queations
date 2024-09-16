package Leetcode_questions.linked_list.q4;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public class Solution {

    public int pairSum(ListNode head) {
        if (head == null) return 0;

        // Step 1: Use slow and fast pointers to find the middle of the list
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the linked list
        ListNode secondHalf = reverse(slow);

        // Step 3: Compute the twin sums and find the maximum sum
        ListNode firstHalf = head;
        int maxSum = 0;
        while (secondHalf != null) {
            maxSum = Math.max(maxSum, firstHalf.val + secondHalf.val);
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return maxSum;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
    }
}
