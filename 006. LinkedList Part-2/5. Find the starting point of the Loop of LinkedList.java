// This approch involves find the where both slow and fast meet when you find 
// slow store in another variable and trverse thruogh it using do while until its not equal to slow
// then again slow and fast when both meet caluclate length by callling above function whc=ich perform above operation
// then move only by the length
// then make fast to head and traverse untill fast !=slow
public class Solution {
    public int lengthCycle(ListNode head){
        
        ListNode fast=head;
        ListNode slow =head;
        while(fast!=null&& fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        int len=0;
            if(fast==slow){
                ListNode temp=slow;
                do{
                    temp=temp.next;
                    len++;
                }while(temp!=slow);
                return len;
                
            }
            
        }
        return 0;
    }
     public ListNode detectCycle(ListNode head) {
         int length=0;
          ListNode fast=head;
        ListNode slow =head;
        while(fast!=null&& fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        
         
         if(fast==slow){
          length=lengthCycle(head);
             break;
         }
           
            }
          if(length==0){
                return null;
          }
        ListNode s= head;
         ListNode f=head;
        while(length>0){
            s=s.next;
            length--;
            
        }
         while(f!=s){
             s=s.next;
            f=f.next;
         }
         return s;
    }
}
****************************************************************** 
Better One
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
