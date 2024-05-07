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
    public ListNode doubleIt(ListNode head) {

        if(head == null){
            return head;
        }
        head = reverse(head);
        ListNode dummy = new ListNode(0);
        ListNode tempNode = dummy;
        int carry = 0;
        while(head!=null){
            int val = (head.val*2)+carry;
            int rem = val%10;
            carry = val/10;
            tempNode.next = new ListNode(rem);
            tempNode = tempNode.next;
            head = head.next;
        }

        if(carry>0){
            tempNode.next = new ListNode(carry);
        }


       
        return reverse(dummy.next);
        
    }


    private ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr =  head;

        while(curr!=null){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        head = prev;
        return head;
    }
}