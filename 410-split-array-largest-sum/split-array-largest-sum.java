class Solution {
    public int splitArray(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        int n=nums.length;
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            max=Math.max(max,nums[i]);
        }
        int low=max;
        int high=sum;
       while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(isPossibleSplit(nums,mid,k))
            {
               ans=mid;
               high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean isPossibleSplit(int[] arr,int maxSum,int k)
    {
        int noOfSubArrays=1,initialSum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(initialSum+arr[i]<=maxSum)
            {
                  initialSum+=arr[i];
            }
            else
            {
                noOfSubArrays++;
                initialSum=arr[i];
            }
        }
        return noOfSubArrays<=k;
    }
}