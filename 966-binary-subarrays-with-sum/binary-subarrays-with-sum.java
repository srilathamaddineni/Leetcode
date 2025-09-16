class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
       return atMost(nums,goal)-atMost(nums,goal-1);
    }
    public int atMost(int nums[],int goal)
    {
        if(goal<0)
        {
            return 0;
        }
        int result=0;
        int l=0;
        int cnt=0;
        int n=nums.length;
        for(int r=0;r<nums.length;r++)
        {//r=0
            cnt=cnt+nums[r];//1,0
            while(cnt>goal && l<n)
            {
               cnt-=nums[l];
               l++;
            }
           
                result+=r-l+1;
        }
        return result;
    }
    
}