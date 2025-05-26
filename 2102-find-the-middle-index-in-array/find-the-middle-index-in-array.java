class Solution {
    public int findMiddleIndex(int[] nums) {
        int middleIndex=Integer.MAX_VALUE;
        int n=nums.length;
        int prefix[]=new int[n];
        int suffix[]=new int[n];
        prefix[0]=nums[0];
        suffix[n-1]=nums[n-1];
        if(n==1)
         return 0;
        for(int i=1;i<nums.length;i++)
        {
           prefix[i]=nums[i]+prefix[i-1];
          
        }
        for(int i=n-2;i>=0;i--)
        {
           suffix[i]=nums[i]+suffix[i+1];     
        }
        if(suffix[1]==0)
        {
            middleIndex=Math.min(0,middleIndex);
        }
        if(prefix[n-2]==0)
        {
            middleIndex=Math.min(n-1,middleIndex);
        }
        for(int i=1;i<n-1;i++)
        {
            if(prefix[i-1]==suffix[i+1])
            {
                middleIndex=Math.min(i,middleIndex);
            }
        }
        return middleIndex==Integer.MAX_VALUE?-1:middleIndex;
    }
}