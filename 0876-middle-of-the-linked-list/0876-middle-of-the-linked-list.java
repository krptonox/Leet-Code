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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while(temp!=null){
           temp=temp.next;
           count++;
        }
        ListNode temp1 = head;
        int chk = count/2;
        
        while(chk>0){
            temp1=temp1.next;
            chk--;
        }
        return temp1;
    }
}