/*Q: Given an integer numRows, return the first numRows of Pascal's triangle.
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
*/
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<numRows;i++){// This loop for rows
            List<Integer> row= new ArrayList<>();
            for(int j=0;j<=i;j++){// this for cols
                if(j==0||j==i) row.add(1);
                else{
                    row.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));// this is the main logic we are taking previous added list from that we are adding the elements
                }
            }
            ans.add(row);
        }
        return ans;
    }
}
