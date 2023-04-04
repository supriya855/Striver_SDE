Q: Question states you need to remove duplicate elements that should happen in inplace
EX:
//input: [1,1,2]
//output : 2 i.e [1,2]
Approach :
// to remove duplicates I used set
// converted my set arraylist and traverse through it and placed my arraylist values into numms
//returned the size arraylist
class Solution {
    public int removeDuplicates(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
       for(int i=0;i<nums.length;i++){
           set.add(nums[i]);
       }
     ArrayList<Integer> list = new ArrayList<>(set);
      Collections.sort(list);
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
    return list.size();
    }
}
****************************************************************
Optimized Approach:
class Solution {
    public int removeDuplicates(int[] nums) {
    int i = 0;
    for (int n : nums)
        if (i == 0 || n > nums[i-1])
            nums[i++] = n;
    return i;
}
}
