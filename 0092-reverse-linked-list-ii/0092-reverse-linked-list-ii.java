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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;

        ListNode curr = head;
        ListNode prev = null;

        for (int i = 1; i < left; i++) {
            prev = curr;
            curr = curr.next;
        }

        ListNode leftNode = curr;
        ListNode prevLeft = prev;

        ListNode nextPart = curr;
        for (int i = 0; i < right - left + 1; i++) {
            nextPart = nextPart.next;
        }

        ListNode reversedHead = reversePart(leftNode, right - left + 1);

        if (prevLeft != null) {
            prevLeft.next = reversedHead;
        } else {
            head = reversedHead;
        }

        leftNode.next = nextPart;

        return head;
    }

    public ListNode reversePart(ListNode head, int k) {
        ListNode prev = null;
        ListNode curr = head;

        while (k-- > 0) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
