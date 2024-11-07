class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       //Brute Force
        /*int m=matrix.length;
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
        return false;*/
        //Optimized Solution
        int m=matrix.length;     
        int low=0;
        int high=m-1;
        if (matrix.length == 0 || matrix[0].length == 0) {
             return false;
        }
        while(low<=high)
        {
            int mid=(low+high)/2;
            int n=matrix[mid].length;
            if(matrix[mid][0]>target)
            {
                high=mid-1;
            }
            else if(matrix[mid][n-1]<target)
            {
                low=mid+1;
            }
            else
            { 
               int low1=0, high1=n-1;
               while(low1<=high1)
             { 
               int mid1=(low1+high1)/2;
               if(matrix[mid][mid1]==target)
               {
                  return true;
               }
               else if(matrix[mid][mid1]>target)
               {
                 high1=mid1-1;
               }
               else
               {
                  low1=mid1+1;
               }

            }
            return false;
            }
            
        }
        return false;

    }
}