//Easy problem 
//Intution behind this find the whole length len/2 is where your middle node present
class Solution {
    public ListNode middleNode(ListNode head) {
        int len=0;
        ListNode tmp=head;
        ListNode temp=head;
        while(tmp!=null){
            len++;
            tmp=tmp.next;
        }
        int i=0;
        while(temp!=null&&i<len/2){
            temp=temp.next;
            i++;
        }
        return temp;
    }
}
