class Solution {
    public void sortColors(int[] nums) {
        int count[]=new int[3];
        for(int i=0;i<nums.length;i++)
        {
            count[nums[i]]++;
        }
        for(int i=1;i<3;i++)
        {
            count[i]+=count[i-1];
        }
        int n=nums.length;
        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            ans[count[nums[i]] - 1] = nums[i];
            count[nums[i]]--;
        }
        for(int i=0;i<n;i++)
        {
            nums[i]=ans[i];
        }
    }
}