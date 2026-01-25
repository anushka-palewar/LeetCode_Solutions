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
        ListNode dummy=new ListNode(0);
        ListNode tempDummy=dummy;

        ListNode h1=l1,h2=l2;
        int carry=0;
        while(h1!=null || h2!=null){
            int sum=carry;

            if(h1!=null){
                sum+=h1.val;
                h1=h1.next;
            }

            if(h2!=null){
                sum+=h2.val;
                h2=h2.next;
            }

            carry=sum/10;
            dummy.next=new ListNode(sum%10);
            dummy=dummy.next;
        }

        if(carry>0){
            dummy.next=new ListNode(carry);
        }

        return tempDummy.next;
    }
}