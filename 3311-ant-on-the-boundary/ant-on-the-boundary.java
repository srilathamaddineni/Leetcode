class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int currentIndex=0;
        int noOfTimes=0;
        for(int i=0;i<nums.length;i++)
        {
            currentIndex+=nums[i];
            if(currentIndex==0)
            {
                 noOfTimes++;
            }
        }
        return noOfTimes;
    }
}