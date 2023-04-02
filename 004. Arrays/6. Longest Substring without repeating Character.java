class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        Queue<Character> q= new LinkedList<>();
        for(char c: s.toCharArray()){
        while(q.contains(c)){//checking for all elements untill we found new one
            q.poll();
        }
        q.add(c);
        max=Math.max(max,q.size());
    }
    return max;
    }
}
// TC:O(N) SC:O(N)
