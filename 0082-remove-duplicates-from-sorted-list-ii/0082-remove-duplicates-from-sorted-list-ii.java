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
        if(head == null  ||  head.next == null)
			return head;
		ListNode dummy = new ListNode(0);
		ListNode result= dummy;
		result.next = head;
		ListNode i = head;
		ListNode prev = null;
		
		
		while(i != null) {
			if(i.next!=null &&i.val == i.next.val ) {
				prev = i.next;
				i = i.next.next;
			}else if(prev!=null && prev.val == i.val) {
				prev = i; 
				i = i.next;
			}else {
				ListNode temp = i;
				result.next = temp;
				result = temp;
				i = i.next;
			}
			result.next = null;
		}

		return dummy.next;
    }
}