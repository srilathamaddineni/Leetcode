class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int num=0;
        if(nums[0]!=0)
          return 0;
        if(nums[nums.length-1]!=n)
          return n;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1]+1)
            {
                num=nums[i]-1;
            }
        }

        return num;
    }
}