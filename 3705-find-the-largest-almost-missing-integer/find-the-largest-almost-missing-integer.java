class Solution {
    public int largestInteger(int[] nums, int k) {
        // Brute Force Approach
        // int max=-1;
        // int j=0;
        // int arr[]=new int[51];
        // while(j+k<=nums.length)
        // {
        //     Set<Integer> set=new HashSet<>();
        //     for(int i=j;i<j+k;i++)
        //     {
        //         if(!set.contains(nums[i]))
        //         {
        //           set.add(nums[i]);
        //             arr[nums[i]]++;
        //         }
        //     }
        //     j++;
            
        // }
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(arr[nums[i]]==1)
        //     {
        //         max=Math.max(max,nums[i]);
        //     }
        // }
        // return max;
        //Optimized
        Map<Integer,Integer> freqMap=new HashMap<>();
        int ans=-1,uniqueLargest=-1,largest=-1;
        for(int i=0;i<nums.length;i++)
        {
           freqMap.put(nums[i],freqMap.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(freqMap.get(nums[i])==1)
            {
                uniqueLargest=Math.max(uniqueLargest,nums[i]);
            }
            largest=Math.max(largest,nums[i]);
        }
        if(k==1)return uniqueLargest;
        if(k==nums.length)return largest;
        if(freqMap.get(nums[0])==1)ans=Math.max(ans,nums[0]);
        if(freqMap.get(nums[nums.length-1])==1)ans=Math.max(ans,nums[nums.length-1]);
        return ans;
        

    }
}