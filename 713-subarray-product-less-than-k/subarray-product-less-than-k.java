class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1)return 0;
        int ans=0;
        int prod=nums[0];
        if(prod<k)ans++;
        int left=0,right=1;
        while(right<nums.length)
        {
            prod=prod*nums[right];
            if(prod<k)
            {
                ans+=right-left+1;
            }
            else
            {
                while(prod>=k)
                {
                    prod=prod/nums[left];
                    left++;
                }
                ans+=right-left+1;
            }
            right++;

        }
        return ans;
    
    }
}