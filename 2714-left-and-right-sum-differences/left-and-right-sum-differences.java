class Solution {
    public int[] leftRightDifference(int[] nums) {
        int length=nums.length;
        int[] leftSum=new int[length];
        int rightSum=0;
        int[] result=new int[length];
        leftSum[0]=0;
        for(int i=1;i<length;i++)
        {
            leftSum[i]=leftSum[i-1]+nums[i-1];
        }
        for(int i=length-2;i>=0;i--)
        {
            rightSum=rightSum+nums[i+1];
           // rightSum[i]=rightSum[i+1]+nums[i+1];
            result[i]=Math.abs(rightSum-leftSum[i]);
        }
        result[length-1]=leftSum[length-1];
        return result;
    }
}