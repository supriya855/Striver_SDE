/*
Q: Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
You must do it in place.
Example :
input:
1 1 1
1 0 1
1 1 1
output: 
1 0 1
0 0 0
1 0 1

*/
Approach -1:
class Solution {
    public void setZeroes(int[][] matrix) {
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    for(int k=0;k<matrix.length;k++){
                        if(matrix[k][j]!=0){
                            matrix[k][j]=1000;
                        }
                    }
                    for(int l=0;l<matrix[0].length;l++){
                        if(matrix[i][l]!=0){
                            matrix[i][l]=1000;
                        }
                    }
                    
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==1000){
                    matrix[i][j]=0;
                }
            }
        }
        
    }
}
***************************************************************************************************************
Approach -2:
class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firCol=false;
        boolean firRow=false;
        // Checking if zero is present in firstCol if it is we are making it zero here 
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]==0){
                firCol=true;
                break;
            }
        }
        //same for firstCol we are making their entire row to zero at the end
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[0][j]==0){
                firRow=true;
                break;
            }
        }
        // Checking that where zero is present
        // And that respective first row and first col we are making it to zero
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
        // After making there first row and first and col to zero 
        // we are making their entire row and col to zero with thier respective zero which we found originally in matrxi
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[i].length;j++){
                if(matrix[i][0]==0||matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(firCol){
            for(int i=0;i<matrix.length;i++){
                matrix[i][0]=0;
            }
        }
        if(firRow){
            for(int j=0;j<matrix[0].length;j++){
                matrix[0][j]=0;
            }
        }
    }
