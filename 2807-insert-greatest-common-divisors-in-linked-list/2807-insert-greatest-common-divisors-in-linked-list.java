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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode prev=head;
        ListNode curr=head.next;

        while(curr!=null){
            int gcd=findgcd(prev.val,curr.val);
            ListNode temp=new ListNode(gcd,curr);
            prev.next=temp;

            prev = curr;
            curr = curr.next;
        }
        return head;
    }
    private int findgcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}