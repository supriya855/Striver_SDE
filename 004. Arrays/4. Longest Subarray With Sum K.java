Q: Find the largest subarray sum 
input : N = 8
        A[] = {15,-2,2,-8,1,7,10,23}
output : 5
*********************************************************
//Code:
import java.util.*;
class GfG
{
    int maxLen(int arr[], int n)
    {
        int len=0;
       for(int i=0;i<arr.length;i++){
           int sum=0;
           for(int j=i;j<arr.length;j++){
               sum+=arr[j];
               if(sum==0) len=Math.max(len,j-i+1);
           }
       }
       return len;
    }
}
// This taken O(N^2) which gives TLE
*********************************************************************
// Optimized a bit hard to get that one 
// HashMap dry run it
import java.util.*;
class GfG
{
    int maxLen(int arr[], int n)
    {
      HashMap<Integer,Integer> map=new HashMap<>();
      int sum=0,max_len=0;
      for(int i=0;i<n;i++){
          sum+=arr[i];
          if(sum==0) 
          max_len=Math.max(max_len,i+1);
        else {
              if(map.containsKey(sum)){
                max_len=Math.max(max_len,i-map.get(sum));
              }
              else{
                  map.put(sum,i);
              }
              
          }
      }
    return max_len;
    }
}
   
