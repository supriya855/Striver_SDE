// we can do with recursion but it is giving TLE
class Solution {
    public int uniquePaths(int m, int n) {
         int[][] dp= new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return countPaths(0,0,m,n,dp);
    }
    public int countPaths(int i,int j,int m,int n,int[][] dp){
        if(i==m-1&&j==n-1) return 1;
        if(i>=m||j>=n) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        else
        return dp[i][j]=countPaths(i+1,j,m,n,dp)+countPaths(i,j+1,m,n,dp);
    }
}
   // for m=2 and n=2
   /*
    |s | |
    | | e|
    Ways to reach end right - down
                       down - right
                          (0,0)
                      (B) /    \(R)
                    (1,0)      (0,1)
                    /  \(R)     (B)/  \
             (x)(2,0)  (1,1)  (1,1) (0,2)(x)
   */
