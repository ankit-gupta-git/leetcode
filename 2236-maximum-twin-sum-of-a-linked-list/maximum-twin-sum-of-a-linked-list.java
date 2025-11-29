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
public static ListNode reverse(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;

    while (curr != null) {
        ListNode next = curr.next; // store
        curr.next = prev;          // reverse
        prev = curr;               // move prev
        curr = next;               // move curr
    }

    return prev;
}


    public int pairSum(ListNode head) {
        ListNode slow = head, fast = head, prev = null;

        //middle of ll

        while(fast != null && fast.next !=  null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        prev.next = reverse(slow);
        int ans = 0;
        ListNode temp1 = head, temp2 = prev.next;
        while(temp2 != null) {
            ans = Math.max(ans, temp1.val+temp2.val);
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return ans;      
    }
}