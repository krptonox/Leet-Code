/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode temp = head;
        ListNode temp1 = head;
        int val = 0;
        while(temp!=null && temp.next!=null){
          temp1=temp1.next;
          temp=temp.next.next;
          if(temp1==temp){
              return true;
          }
        }
        return false;
    }
}