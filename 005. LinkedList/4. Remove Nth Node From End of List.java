/* You have linkedlist and given n value so that you need to delete node from that last
input : 1->2-> 3->4->5 
        n=2
output: 1->2->3->5
*/
Intution:
// instead of going with reverseal we are taking whole length of LL and subtract the n from it
// so we can traverse from front to delete node in n position
Approach :
/*1. count the length of the LL
2. check some edges case pos=totalLen-n 
3. take count variable to to start count at which node you are while traversing
4. traverse whole LL check when count==pos delete the elemet
5. if count> pos then prev node . next is null
6. if pos==0 you need to delete start element head =head.next;
return head*/
Code:
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
        ListNode dummy=head,temp=head;
        int totalLen=0;
        while(dummy!=null){
            totalLen+=1;
            dummy=dummy.next;
        }
        int pos=totalLen-n,count=1;
        if(pos==count&&temp.next!=null){
             temp.next=temp.next.next;

        }
        else if(pos!=0){
            while(temp.next!=null){
            ListNode prev =temp;
            temp=temp.next;
             count++;
            if(count==pos){
                temp.next=temp.next.next;
                break;
            }
            else if(count>pos)
               prev.next=null;
            }
        }
        else{
             head=head.next;
        }
        return head;
    }
}
Time Complexity:
O(N)
Space Complexity
O(1)
