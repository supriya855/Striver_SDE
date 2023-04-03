// Intution Behind this by looking at question you simply figure we need to sum element
// sum the elements adding when carry is present add into sum using divsion 
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp=new ListNode(0);
        ListNode dummy=temp;
        int carry=0;
        while(l1!=null||l2!=null||carry==1){
            int sum=0;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            sum+=carry;
            carry=sum/10;
            temp.next= new ListNode(sum%10);
            temp=temp.next;
        }
        return dummy.next;
    }
}
