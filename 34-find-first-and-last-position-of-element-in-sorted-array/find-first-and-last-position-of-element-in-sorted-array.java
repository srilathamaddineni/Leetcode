class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]={-1,-1};
        arr[0]=lowerBound(nums,target);
        arr[1]=upperBound(nums,target);
        return arr;
       
    }
    int lowerBound(int[] nums,int target)
    {
        int low=0;
        int high=nums.length-1;
        int lb=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]>=target)
            {
               
               if(nums[mid]==target)lb=mid;
               high=mid-1;
            }
            else
            {
                
                low=mid+1;
            }
        }
        return lb;
    }
    int upperBound(int[] nums,int target)
    {
        int low=0;
        int high=nums.length-1;
        int ub=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]<=target)
            {
               if(nums[mid]==target)ub=mid;
                low=mid+1;
            }
            else
            {
               
                high=mid-1;
            }
        }
       
        return ub;
    }
}