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

   
