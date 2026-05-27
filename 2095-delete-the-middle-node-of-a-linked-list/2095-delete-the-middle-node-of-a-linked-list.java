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
    public ListNode deleteMiddle(ListNode head) {
        int count = 0;
        ListNode temp = head;
        if(head==null || head.next==null){
            return head.next;
        }
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        int chk = count/2;
        ListNode temp1 = head;
        for(int i=0;i<chk-1;i++){
            temp1 = temp1.next;
        }
        temp1.next = temp1.next.next;
        
        return head;
    }
}