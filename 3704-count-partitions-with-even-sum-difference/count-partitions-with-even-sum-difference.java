class Solution {
    public int countPartitions(int[] nums) {
        int rightSum=0;
        int leftSum=0;
        int cnt=0;
        for(int num:nums)
        {
            rightSum+=num;
        }
        for(int i=0;i<nums.length-1;i++)
        {
            rightSum=rightSum-nums[i];
            leftSum+=nums[i];
            if(Math.abs(rightSum-leftSum)%2==0)
            {
               cnt++;
            }
        }
        return cnt;
    }
}