class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int result[]=new int[51];
        for(int[] range:ranges)
        {
            int m=range[0];
            int n=range[1];
            for(int j=m;j<=n;j++)
            {
                 result[j]++;
            }
        }
        for(int i=left;i<=right;i++)
        {
            if(result[i]==0)
            {
                return false;
            }
        }
        return true;
    }
}