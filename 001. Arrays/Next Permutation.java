/* Question:
A permutation of an array of integers is an arrangement of its members into a sequence or linear order.
For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].

Input: nums = [1,2,3]
Output: [1,3,2]
*/
Approach: This is something you need think in a different way
ex: 1 3 5 4 2
    5
 3    4
1       2
  (here you can obeserve 
  - in reverse direction where we can find out the non increase number (above example non increasing number is 3)
  - then you have to find the a number which is greater than non increase then swap(the number greater than non increasing number is 4 if we traverse again in reverse direction)
   [1,4,5,3,2]
  - from that number to last number we need to reverse it [1,4,2,3,5]
class Solution {
    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
        while(i>=0 && nums[i+1]<=nums[i]) i--;// here nums[i+1]<nums[i] coz we are checking nums[i] is the non increasing number here
        if(i>=0){//  i values is where find non -increasing number
          int j=nums.length-1;
            while(nums[j]<=nums[i]) j--;
            swap(nums,i,j);
        }
        reverse(nums,i+1,nums.length-1);
        
    }
    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void reverse(int[] nums,int i,int j){
        while(i<j) swap(nums,i++,j--);
    }
}
