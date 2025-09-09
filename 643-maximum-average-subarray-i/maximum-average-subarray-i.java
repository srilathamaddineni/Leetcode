class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int window_sum=0;
        int window_start=0;
        for(int i=0;i<k;i++)
        {
           window_sum+=nums[i];
        }
        double avg=(double)window_sum/k;
        for(int i=k;i<nums.length;i++)
        {
            window_sum=window_sum-nums[window_start]+nums[i];
            window_start++;
            avg=Math.max(avg,(double)window_sum/k);
        }
        return avg;


    }
}