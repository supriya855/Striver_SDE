// Brute force Approach where it gives TLE for a larger input
class Solution {
    public List<List<Integer>> threeSum(int[] nums) { 
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<=nums.length-3;i++){
            for(int j=i+1;j<=nums.length-2;j++){
                for(int k=j+1;k<=nums.length-1;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> l = new ArrayList<>();
                        l.add(nums[i]);
                        l.add(nums[j]);
                        l.add(nums[k]);
                        if(!res.contains(l)){
                            res.add(l);
                    }
                }
            }
        }
    }
      return res;
        
    }
}
// This is an optimized approach we are removing the duplicates by checking with if and while loop
class Solution {
    public List<List<Integer>> threeSum(int[] nums) { 
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<=nums.length-3;i++){
            if(i>0&&nums[i-1]==nums[i]) continue;
           int left =i+1, right=nums.length-1;
           while(left<right){
                    long sum =nums[i]+nums[left]+nums[right];
                    if(sum==0){
                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                      left++;
                      right--;
                      while(left<right&&nums[left-1]==nums[left]) left++;
                      while(left>right&&nums[right+1]==nums[right]) right++;
                    }
                else if(sum<0) left++;
                else
                right--;
            }
        }
     return res;       
    }
}
