package Leetcode_questions.linked_list.q2;

import java.util.LinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Initialize odd and even pointers
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;  // To link the end of odd list to the start of even list later

        // Traverse the list
        while (even != null && even.next != null) {
            odd.next = even.next;  // Point odd node to the next odd node
            odd = odd.next;  // Move odd pointer
            even.next = odd.next;  // Point even node to the next even node
            even = even.next;  // Move even pointer
        }

        // Connect the end of the odd list to the head of the even list
        odd.next = evenHead;

        return head;  // Return the reordered list
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        LinkedList<Integer> integers = new LinkedList<>();

        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
    }
}
