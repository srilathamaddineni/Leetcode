class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       
        int m=matrix.length;
        for(int i=0;i<m;i++)
        {
           int n=matrix[i].length;
           if(matrix[i][n-1]>=target && matrix[i][0]<=target)
           {
              for(int j=0;j<n;j++)
              {
                 if(matrix[i][j]==target)
                    return true;
              }
           }
        }
        return false;
    }
}