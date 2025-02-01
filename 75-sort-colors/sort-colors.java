class Solution {
    public void sortColors(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(max,nums[i]);
        }
        int cntArray[]=new int[max+1];
        for(int i=0;i<nums.length;i++)
        {
            cntArray[nums[i]]++;
        }
        for(int i=1;i<=max;i++)
        {
            cntArray[i]+=cntArray[i-1];
        }

        int modifiedArray[]=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--)
        {
            modifiedArray[cntArray[nums[i]]-1]=nums[i];
            cntArray[nums[i]]--;
        }
         for(int i=nums.length-1;i>=0;i--)
        {
            nums[i]=modifiedArray[i];
            
        }

    }
}