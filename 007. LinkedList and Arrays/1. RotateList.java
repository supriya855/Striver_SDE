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
 class Solution{
public ListNode rotateRight(ListNode head, int k) {
    if (head == null || head.next == null || k == 0) {
        return head;
    }

    // Count the number of nodes in the linked list
    int n = 1;
    ListNode temp = head;
    while (temp.next != null) {
        temp = temp.next;
        n++;
    }

    // Adjust the value of k
    k = k % n;
    if (k == 0) {
        return head;
    }

    // Find the (n-k)th node from the beginning of the linked list
    ListNode prev = null;
    ListNode curr = head;
    for (int i = 1; i <= n - k; i++) {
        prev = curr;
        curr = curr.next;
    }

    // Rotate the linked list
    temp.next = head; 
    head = curr;
    prev.next = null;

    return head;
}
// 1->2->3->4->5 intiall head
//     1->2->3->4->5 -> 1 it forms a circle (here I can't draw the circle 1 is same that next is pointing to the start')
// then moving head to curr then it became 4->5->1->2->3
 }
