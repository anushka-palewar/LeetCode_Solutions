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
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> stack=new Stack<>();
        ListNode curr=head;
        while(curr!=null){
            while (!stack.isEmpty() && stack.peek() < curr.val) {
                stack.pop();
            }
            stack.push(curr.val);
            curr = curr.next;
        }

        ListNode dummy = new ListNode(0);
        while (!stack.isEmpty()) {
            ListNode node = new ListNode(stack.pop());
            node.next = dummy.next;
            dummy.next = node;
        }

        return dummy.next;
    }
}