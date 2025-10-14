class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int divisor=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        int low=1;
        int high=max;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(sumOfDivisors(nums,mid)<=threshold)
            {
                divisor=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }

        
        return divisor;

    }
    public int sumOfDivisors(int arr[],int divisor)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=(int)Math.ceil((double)arr[i]/divisor);
        }
        return sum;
    }
}