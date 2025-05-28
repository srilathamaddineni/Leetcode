class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // int left=0;
        // int minLength=Integer.MAX_VALUE;
        // int currSum=0;
        // for(int right=0;right<nums.length;right++)
        // {
        //     currSum+=nums[right];
        //     while(currSum>=target)
        //     {
        //         if(right-left+1<minLength)
        //         {
        //             minLength=right-left+1;
        //         }
        //         currSum-=nums[left];
        //         left++;
        //     }
        // }
        // return minLength==Integer.MAX_VALUE?0:minLength;
        //Prefix+BinarySearch
        int n=nums.length;
        int prefix[]=new int[n+1];
        for(int i=0;i<n;i++)
        {
            prefix[i+1]=prefix[i]+nums[i];
        }
        int minLength=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            int toFind=prefix[i]+target;
            int bound=binarySearch(prefix,toFind);
            if(bound!=-1)
            {
                minLength=Math.min(minLength,bound-i);
            }
        }
        return minLength==Integer.MAX_VALUE?0:minLength;
    }
    public int binarySearch(int[] prefix,int target)
    {
        int left=0,right=prefix.length-1;
        int result=-1;
        while(left<=right)
        {
           int mid=left+(right-left)/2;
           if(prefix[mid]>=target)
           {
              result=mid;
              right=mid-1;
           }
           else
           {
              left=mid+1;
           }
        }
        return result;
    }
}