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

        head = reverse(head);
        ListNode curr = head;

        while(curr.next!=null){
            if(curr.val > curr.next.val){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }

        return reverse(head);
        
    }


    private ListNode reverse(ListNode curr){
        ListNode prev = null;
        while(curr!=null){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}