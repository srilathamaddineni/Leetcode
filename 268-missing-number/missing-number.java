class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        if(nums[0]!=0)
          return 0;
        if(nums[nums.length-1]!=n)
          return n;
        int start=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=i)
            {
               return i;
            }
        }

        return 0;
    }
}