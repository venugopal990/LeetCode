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
    public ListNode rotateRight(ListNode head, int k) {

		


        if(head == null)
			return null;
		
		if(head.next ==  null)
			return head;    

        ListNode countNode = head;
		int count = 0;
		while(countNode!=null) {
			countNode = countNode.next;
			count++;
		}
		k=k%count;

        if(k ==  0)
			return head;

		head = reverseLinkedList(head);
		ListNode firstList = head;
		ListNode secondList = head.next;
		for (int i = 1; i < k; i++) {
			firstList = secondList;
			secondList = firstList.next;
		}
        firstList.next = null;
        firstList = reverseLinkedList(head);
		secondList = reverseLinkedList(secondList);
        head.next = secondList;
		return firstList;
    }



    private ListNode reverseLinkedList(ListNode head) {
		if(head == null)
			return null;
		
		if(head.next ==  null)
			return head;
		
		ListNode prev = null;
		ListNode curr = head;
		
		while(curr!=null) {
			ListNode nextNode = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextNode;
		}
		head = prev;
		return head;
		
	}
}