class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int window_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
            window_sum += nums[i];              // expand window
            
            if (i >= k - 1) {                   // once window reaches size k
                max_sum = Math.max(max_sum, window_sum);
                window_sum -= nums[i - k + 1];  // shrink from left
            }
        }
        
        return (double) max_sum / k;


    }
}