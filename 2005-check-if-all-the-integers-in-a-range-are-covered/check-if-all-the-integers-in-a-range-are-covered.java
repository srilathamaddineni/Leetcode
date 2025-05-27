class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        boolean flag=false;
        for(int i=left;i<=right;i++)
        {
            for(int[] range:ranges)
            {
                if(i>=range[0] && i<=range[1])
                {
                    flag=true;
                    break;
                }
            }
            if(!flag)return false;
            flag=false;
        }
        return true;
    }
}