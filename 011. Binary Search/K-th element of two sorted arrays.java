// Naive Approach
class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
       int[] arr= new int[n+m];
       int res=0;
       for(int i=0;i<n;i++){
           arr[i]=arr1[i];
       }
           for(int j=0;j<m;j++){
           arr[n+j]=arr2[j];
           }
       Arrays.sort(arr);
       res=arr[k-1];
       return res;
    }
}
*****************************************************************************************
// This is using merge sort
// TC:O(nlogn) SC:O(N)
class Solution {
    // This is using merge Sort
    public long kthElement( int arr1[], int arr2[], int n, int m, int l) {
       int[] arr= new int[n+m];
       int i=0,j=0,k=0;
       while(i<n&&j<m){
           if(arr1[i]<arr2[j]){
               arr[k]=arr1[i];
               i++;
           }
          else{
               arr[k]=arr2[j];
               j++;
           }
           k++;
       }
       while(i<n&&k<n+m){
           arr[k]=arr1[i];
           i++;
           k++;
       }
         while(j<m&&k<n+m){
           arr[k]=arr2[j];
           j++;
           k++;
       }
        return arr[l-1];
    }
}
