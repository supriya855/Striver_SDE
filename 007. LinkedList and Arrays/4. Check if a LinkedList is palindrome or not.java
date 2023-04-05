// slow and fast pointer approach
// here we are making slow into middle position when fast is in last or second position
// after that reverese slow which will reflect on original list
// compare first start to mid mid to end are equal 
// if equal palindrome
//else not a palindrome
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode dummy=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode temp=slow;
     ListNode t =reverse(temp);
     while(t.next!=null){
         if(dummy.val!=t.val){
             return false;
         }
         t=t.next;
         dummy=dummy.next;
     }
return true;
    }
    public ListNode reverse(ListNode temp){
        ListNode prev =null;
        while(temp!=null){
            ListNode next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        return prev;
    }
}
