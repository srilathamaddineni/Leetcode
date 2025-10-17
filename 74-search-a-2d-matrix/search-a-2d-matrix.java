class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int low=0;
        int high=m-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int low1=0;
            int high1=n-1;
            int mid1=low1+(high1-low1)/2;
            while(low1<=high1)
            {
                mid1=low1+(high1-low1)/2;
                if(matrix[mid][mid1]==target)
                {
                    return true;
                }
                else if(matrix[mid][mid1]<target)
                {
                    low1=mid1+1;
                }
                else
                {
                    high1=mid1-1;
                }
            }
            if(matrix[mid][mid1]==target)
            {
                return true;
            }
            else if(matrix[mid][mid1]<target)
            {
                   low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }

    return false;
    }
}