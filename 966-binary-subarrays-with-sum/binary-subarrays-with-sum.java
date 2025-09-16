class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int result=0;
        for(int i=0;i<nums.length;i++)
        {
            int cnt=0;
            for(int j=i;j<nums.length;j++)
            {
                cnt=cnt+nums[j];
                if(cnt==goal)
                {
                    result++;
                }
                if(cnt>goal)
                {
                    break;
                }
            }
        }
        return result;
    }
    
}