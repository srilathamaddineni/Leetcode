class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int top=0;
        int bottom=n-1;
        int left=0;
        int right=m-1;
        while(top<=bottom)
        {
            int row_mid=top+(bottom-top)/2;
            int col_mid=left+(right-left)/2;
            if(matrix[row_mid][col_mid]==target)
               return true;
            else if(matrix[row_mid][col_mid]<target)
            {
                for(int j=col_mid+1;j<=right;j++)
                {
                    if(matrix[row_mid][j]==target)
                       return true;
                }
                top=row_mid+1;
            }
             else
            {
                for(int j=0;j<col_mid;j++)
                {
                    if(matrix[row_mid][j]==target)
                       return true;
                }
                
                bottom=row_mid-1;
            }
            
        }
       return false;
    }
}