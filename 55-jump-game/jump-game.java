class Solution {
    public boolean canJump(int[] nums) {
        int reachable=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            if(i>reachable)
             return false;
            if(reachable>n)
             return true;
            reachable=Math.max(reachable,i+nums[i]);
        }
        return true;
    }
}