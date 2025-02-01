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
       int k=0;
       int l=0;
       while(k<=max)
       {
          if(cntArray[k]>0)
          {
             nums[l++]=k;
             cntArray[k]--;
          }
          else
          {
            k++;
          }
          
       }

    }
}