public class Solution {
    public ListNode detectCycle(ListNode head) {
      ListNode slow=head;
      ListNode fast=head;
      while(fast!=null&&fast.next!=null){
          slow=slow.next;
          fast=fast.next.next;
          if(slow==fast) break;
      }
      // above while loop indicates where both the nodes met 
      // it also say that fast is trversed twice slow i.e fast=2(x+y) and slow=x+y
      // 2(x+y)-(x+y)= length of cycle
      //x+y=len of cycle
      if(fast==null||fast.next==null) return null;
      // if we traverse slow x+y times and head moving a x stpes i.e one step at a time they meet at one point
      while(head!=slow){
          head=head.next;
          slow=slow.next;
      }
      return head;
    }
}
