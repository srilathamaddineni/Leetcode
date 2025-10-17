class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int result[]=new int[2];
        int max=0;
        for(int i=0;i<mat.length;i++)
        {
            int onesCnt=0;
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==1)
                {
                    onesCnt++;
                }
            }
            if(onesCnt>max)
            {
                max=onesCnt;
                result[0]=i;
                result[1]=onesCnt;
            }
        }
        return result;
    }
}