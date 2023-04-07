// MY approach
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode dummy=head;
        ListNode temp=copy(head);
        ListNode rev=reverse(dummy);
        while(temp!=null&&rev!=null){
            if(temp.val!=rev.val){
                return false;
            }
            temp=temp.next;
            rev=rev.next;
        }
        return true;
    }
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
// slow and fast pointer approach
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head, fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
       slow=reverse(slow);
       fast=head;
     while(slow.next!=null){
         if(fast.val!=slow.val){
             return false;
         }
         slow=slow.next;
         fast=fast.next;
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
