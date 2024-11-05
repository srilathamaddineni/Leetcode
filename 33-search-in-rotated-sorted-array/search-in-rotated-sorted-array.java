class Solution {
    public int search(int[] nums, int target) {
        /*Brute Force
        int idx=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                idx=i;
                break;
            }
        }
        return idx;*/
        //Optimized Solution using Binary Search
        int n=nums.length,low=0,high=n-1;
        int idx=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]>=nums[low])
            {
                if(nums[low]<=target && target<=nums[mid])
                {
                    high=mid-1;
                }
                else
                {
                     low=mid+1;
                }
            }
            else
            {
                if(nums[mid]<=target && target<=nums[high])
                {
                   low=mid+1;
                }
                else
                {
                    high=mid-1;
                }
            }
        }
        return idx;
    }
}