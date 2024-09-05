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
    public boolean isPalindrome(ListNode head) {

        ListNode slow =  head;
        ListNode fast =  head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode reverseHead = reverseLL(slow);

        while(reverseHead!=null){
            if(head.val != reverseHead.val){
                return false;
            }
            head = head.next;
            reverseHead =  reverseHead.next;
        }

         return true;
        
    }

    private ListNode reverseLL(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr!=null){
            ListNode nextNode =  curr.next;
            curr.next = prev;
            prev = curr;
            curr =  nextNode;
        }

        return prev;
    }
}