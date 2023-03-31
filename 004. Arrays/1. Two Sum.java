class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer> map = new HashMap<>();
       for(int i=0;i<nums.length;i++){
           int complement =target-nums[i];// 7 2 3 6
           if(map.containsKey(complement)){
               return new int[]{map.get(complement),i};
           }
           map.put(nums[i],i);
       }
       return null;// if nothing is found
    }
}
