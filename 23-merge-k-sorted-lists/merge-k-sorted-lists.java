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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode(0);
        Queue<ListNode> minHeap = new PriorityQueue<ListNode>((a, b) -> a.val - b.val);
        for(ListNode i : lists) {
            if(i != null) {
                minHeap.add(i);
            }
        }
        ListNode curr = head;
        while(minHeap.size() > 0){
            ListNode min = minHeap.poll();
            if(min.next != null) {
                minHeap.add(min.next);
            }
            curr.next = min;
            curr = curr.next;
        }

        return head.next;
        
    }
}