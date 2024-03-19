
class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        if(head == null || head.next == null)
                return head;

        ListNode result = head;
		ListNode i = head.next;
		
		while(i != null) {
			if(result.val == i.val) {
				i  = i.next;
			}else {
                ListNode temp = i;
				result.next = temp;
                result = temp;
				i  = i.next;
			}
            result.next = null;
		}
		
		return head;
    }
}