class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int low=0,high=m-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int row=rowWithMaxValue(mat,mid);
            int left=mid-1>=0?mat[row][mid-1]:-1;
            int right=mid+1<m?mat[row][mid+1]:-1;
            if(mat[row][mid]>left && mat[row][mid]>right)
            {
                return new int[]{row,mid};
            }
            else if(mat[row][mid]<left)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
         
        }
        return new int[]{-1,-1};
    }
    public int rowWithMaxValue(int[][] mat,int col)
    {
        int maxRow=0;
        int maxValue=0;
        for(int i=0;i<mat.length;i++)
        {
            if(mat[i][col]>maxValue)
            {
                maxValue=mat[i][col];
                maxRow=i;
            }
        }
        return maxRow;
    }
}