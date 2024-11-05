class Solution {
    public int[] searchRange(int[] nums, int target) {
        /*Brute Force
        int n=nums.length;
        int left=-1;
        int right=-1;
        
        for(int i=0;i<n;i++)
        {
            if(nums[i]==target)
            {
                left=i;
                break;
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            if(nums[i]==target)
            {
                right=i;
                break;
            }
        }
        int res[]=new int[2];
        res[0]=left;
        res[1]=right;
        return res;*/
      // Binary Search
      int n=nums.length;
      int res[]={-1,-1};
      res[0]=firstOccurence(nums,target);
      res[1]=lastOccurence(nums,target);
      return res;       
    }
    public int firstOccurence(int nums[],int target)
    {
        int low=0,high=nums.length-1,first=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]==target)
            {
                first=mid;
                high=mid-1;
            }
            else if(nums[mid]<target)low=mid+1;
            else high=mid-1;
        }
        return first;
    }
    public int lastOccurence(int nums[],int target)
    {
        int low=0,high=nums.length-1,last=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]==target)
            {
                last=mid;
                low=mid+1;
            }
            else if(nums[mid]<target)low=mid+1;
            else high=mid-1;
        }
        return last;
    }
}