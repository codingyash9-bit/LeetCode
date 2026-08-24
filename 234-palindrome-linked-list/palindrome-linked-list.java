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
        //first find the middle
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //reverse the second half and then compare if they match
        ListNode prev = null;
        ListNode curr = slow;

        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //now comparing 
        ListNode left = head;
        ListNode right = prev;
        while(right!=null){
            if(left.val != right.val){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        //verified palindrome :)
        return true;
    }
}