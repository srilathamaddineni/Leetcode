class Solution {
    public int missingNumber(int[] nums) {
        int len=nums.length;
        int total=(len*(len+1))/2;
        int actTot=0;
        for(int i=0;i<nums.length;i++)
        {
            actTot+=nums[i];
        }
        return total-actTot;
    }
}