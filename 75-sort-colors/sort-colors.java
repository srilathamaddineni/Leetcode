class Solution {
    public void sortColors(int[] nums) {
        // int count[]=new int[3];
        // for(int i=0;i<nums.length;i++)
        // {
        //     count[nums[i]]++;
        // }
        // for(int i=1;i<3;i++)
        // {
        //     count[i]+=count[i-1];
        // }
        // int n=nums.length;
        // int[] ans = new int[n];
        // for (int i = n - 1; i >= 0; i--) {
        //     ans[count[nums[i]] - 1] = nums[i];
        //     count[nums[i]]--;
        // }
        // for(int i=0;i<n;i++)
        // {
        //     nums[i]=ans[i];
        // }
        int cnt0=0;
        int cnt1=0;
        int cnt2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                cnt0++;
            }
            else if(nums[i]==1)
            {
                cnt1++;
            }
            else
            {
                cnt2++;
            }
        }
        int index=0;
        while(cnt1>0 || cnt2>0 || cnt2>0)
        {
            if(cnt0>0)
            {
                nums[index++]=0;
                cnt0--;
            }
            else if(cnt1>0)
            {
                nums[index++]=1;
                cnt1--;
            }
            else
            {
                nums[index++]=2;
                cnt2--;
            }

        }
    }
}