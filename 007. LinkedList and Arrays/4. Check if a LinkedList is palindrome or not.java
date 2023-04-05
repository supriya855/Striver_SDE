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
// This is something my own approach (I never Had an idea of slow and pointer intillay)
// First take head copy the head one variable
// reverse the head 
// orignal values of head and reverse values of a list
// if both are not equal at any point of time return false else return true
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        ListNode dummy=head;
        ListNode temp=copy(head);
        ListNode rev=reverse(dummy);
        // checking isPalindrome or not
        while(temp!=null&&rev!=null){
            if(temp.val!=rev.val){
                return false;
            }
            temp=temp.next;
            rev=rev.next;
        }
        return true;
    }
    // reverse a list
    public ListNode reverse(ListNode h){
        if(h==null) return h;
        ListNode prev=null;
        while(h!=null){
            ListNode next=h.next;
            h.next=prev;
            prev=h;
            h=next;
        }
        return prev;
    }
    //copy the original node
    public ListNode copy(ListNode head){
        if(head==null) return head;
        ListNode dummy = new ListNode(-1);
    ListNode cur = dummy;
    while (head != null) {
        cur.next = new ListNode(head.val);
        cur = cur.next;
        head = head.next;
    }
    return dummy.next;
    }
}

