Question:
/* Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
*/
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0,max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            else{
                count=0;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}
// TC: O(N) , SC :O(1)
********************************************************************
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,countOnes=0;
        for(int num:nums){
            max=Math.max(max,countOnes=num==0?0:countOnes+1);
        }
        return max;
    }
}
