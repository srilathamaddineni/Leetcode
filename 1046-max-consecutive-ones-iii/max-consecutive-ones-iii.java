class Solution {
    public int longestOnes(int[] nums, int k) {  
        int maxLength=0;
        for(int i=0;i<nums.length;i++)
        {  int cnt=0;
            for(int j=i;j<nums.length;j++)
            {
                if(nums[j]==0)
                {
                    if(cnt<k)cnt++;
                    else break;
                }
                maxLength=Math.max(maxLength,j-i+1);
                
            }
        }
        return maxLength;
    

    }
}