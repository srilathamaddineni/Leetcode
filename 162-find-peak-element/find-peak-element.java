class Solution {
    public int findPeakElement(int[] nums) {
        /*Brute Force
        int n=nums.length;
        int idx=0;
        if(nums.length<=1 )
        {
            return 0;
        }
        if(nums[0]>nums[1])
        {
            return 0;
        }
        if(nums[n-1]>nums[n-2])
        {
            return n-1;
        }
        for(int i=1;i<n-1;i++)
        {
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1])
            {
                idx=i;
                break;
            }
        }
        return idx;*/
        //Optimized Approach
        int left=0;
        int right=nums.length-1;
        while(left<right)
        {
            int mid=(left+right)/2;
            if(nums[mid]>nums[mid+1])
            {
                right=mid;
            }
            else
            {
                left=mid+1;
            }
        }
        return left;

    }
}