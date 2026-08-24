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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        //place it at n+1th position 
        for(int i = 0; i<=n ; i++){
            fast = fast.next;
        }

        // shift them with same distance 
        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }

        //now we reach at the place where slow.next is the element to delete
        slow.next = slow.next.next;

        return dummy.next;
    }
}