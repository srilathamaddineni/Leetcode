class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int leftSum=0;
        int rightSum=0;
        for(int num:nums)
        {
           rightSum+=num;
        }
        for(int i=0;i<n;i++)
        {
            int val=nums[i];
            rightSum-=val;
            nums[i]=Math.abs(rightSum-leftSum);
            leftSum+=val;      
        }
        
        return nums;
    }
}