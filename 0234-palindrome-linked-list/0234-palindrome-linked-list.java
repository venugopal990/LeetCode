
class Solution {
    public boolean isPalindrome(ListNode head) {

        ListNode firstHalf = head, secondHalf = head;

        while (secondHalf != null && secondHalf.next != null) {
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next.next;
        }

        if (secondHalf != null) {
            firstHalf = firstHalf.next;
        }

        firstHalf = reverse(firstHalf);
        secondHalf = head;

        while (firstHalf != null) {

            if (firstHalf.val != secondHalf.val) {
                return false;
            }

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;

    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }
}