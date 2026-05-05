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
    public ListNode rotateRight(ListNode head, int k) {

        if (k == 0 || head == null)
            return head;

        int n = 0;
        ListNode temp = head;

        while (temp != null) {
            n++;
            temp = temp.next;
        }
        ListNode prev = head;
        ListNode forw = head;

        k = k % n;
        int t = 0;

        while (forw.next != null) {
            if (t < k) {
                t++;
            } else {
                prev = prev.next;
            }
            forw = forw.next;
        }

        forw.next = head;
        head = prev.next;
        prev.next = null;

        return head;
    }
}
