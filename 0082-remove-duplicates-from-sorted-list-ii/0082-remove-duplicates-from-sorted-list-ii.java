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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;

        ListNode secondprev=null,prev=head,curr=head.next;

        while (curr != null) {

            if (curr.val == prev.val) {   
                while (curr != null && curr.val == prev.val) {
                    curr = curr.next;
                }

                if (secondprev == null) {
                    head = curr;         
                } else {
                    secondprev.next = curr;
                }

                prev = curr;
                if (curr != null) curr = curr.next;
            } else {
                secondprev = prev;
                prev = curr;
                curr = curr.next;
            }
        }

        return head;
    }
}