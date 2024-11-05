class Solution {
    public int search(int[] nums, int target) {
        //Brute Force
        int idx=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                idx=i;
                break;
            }
        }
        return idx;
    }
}