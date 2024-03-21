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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode list2New = new ListNode(0);
        list2New.next = list2;

        ListNode list1New = new ListNode(0);
        list1New.next = list1;

        ListNode list1New1 = list1New.next;


        ListNode list2LastNode = list2;

        while(list2LastNode.next != null){
            list2LastNode = list2LastNode.next;
        }


        int i=0;
        int count=0;
        ListNode list1firstNode = list1;
        ListNode list1LastNode = list1New1;
        while(list1LastNode!=null){

            if(count!=1){
                if((a-1) == i){
                    list1firstNode = list1firstNode;
                    count++;
                }else{
                    list1firstNode = list1firstNode.next;
                }
            }

            list1LastNode = list1LastNode.next;
            if(b == i){
                break;
            }
            i++;    
        }

        list1firstNode.next=list2New.next;
        list2LastNode.next=list1LastNode;

        return list1New.next;
    }
}