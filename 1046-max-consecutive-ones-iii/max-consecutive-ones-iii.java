class Solution {
    public int longestOnes(int[] nums, int k) {  
        // int maxLength=0;
        // for(int i=0;i<nums.length;i++)
        // {  int cnt=0;
        //     for(int j=i;j<nums.length;j++)
        //     {
        //         if(nums[j]==0)
        //         {
        //             if(cnt<k)cnt++;
        //             else break;
        //         }
        //         maxLength=Math.max(maxLength,j-i+1);
                
        //     }
        // }
        // return maxLength;

        //////////////Sliding Window//////////////////////
        int maxLength=0;
        int l=0;
        int zeroes=0;
    //     for(int r=0;r<nums.length;r++)
    //     {
    //        if(nums[r]==0)
    //        {
    //         zeroes++;
    //        }
    //        while(zeroes>k)
    //        {
    //           if(nums[l]==0)
    //           {
    //             zeroes--;
    //           }
    //           l++;
    //        }
    //         maxLength=Math.max(maxLength,r-l+1);
            
    //     }
    //   return maxLength;
    /////////////////removing while loop////////////////////
      int r=0;
      while(r<nums.length)
      {
         if(nums[r]==0)zeroes++;
         if(zeroes>k)
         {
            if(nums[l]==0)zeroes--;
            l++;
         }
         if(zeroes<=k)maxLength=Math.max(maxLength,r-l+1);
         r++;
      }
      return maxLength;

    }
}