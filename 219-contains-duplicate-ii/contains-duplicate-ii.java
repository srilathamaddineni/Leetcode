class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k<=nums.length)
        {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j-i<=k && j<nums.length;j++)
            {
                if(nums[i]==nums[j] && Math.abs(i-j)<=k)
                {
                    return true;
                }
            }
        }
        }
        else
        {
            Arrays.sort(nums);
            for(int i=0;i<nums.length-1;i++)
            {
                if(nums[i]==nums[i+1])
                {
                    return true;
                }
            }
        }
        return false;
    }
}