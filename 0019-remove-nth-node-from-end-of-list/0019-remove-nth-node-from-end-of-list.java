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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        head=rev(head);
        if(n == 1){
            head = head.next;
        }else{
            ListNode temp = head;
            for (int i = 1; i < n - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }

        head=rev(head);
        return head;
    }

    public static ListNode rev(ListNode head){
        ListNode prev=null;
        ListNode temp=head;
        while(temp!=null){
            ListNode nextnode=temp.next;
            temp.next=prev;
            prev=temp;
            temp=nextnode;
        }
        return prev;
    }
}