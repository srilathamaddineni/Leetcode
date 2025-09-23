class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        if(n==1)
        {
            return 0;
        }
        for(int i=0;i<nums.length;i++)
        {
            boolean isLeftGreater=(i==0 || nums[i]>nums[i-1]);
            boolean isRightGreater=(i==n-1 || nums[i]>nums[i+1]);
            if(isLeftGreater && isRightGreater)
            {
                return i;
            }
        }
        return -1;
    }
}