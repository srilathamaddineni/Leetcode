class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        // int n=nums.length;
        // int result=0;
        // for(int i=0;i<n;i++)
        // {
        //     HashMap<Integer,Integer> freqMap=new HashMap<>();
        //     for(int j=i;j<n;j++)
        //     {
        //      
        //         freqMap.put(nums[j],freqMap.getOrDefault(nums[j],0)+1);
        //         if(freqMap.size()>k)
        //           break;
        //         if(freqMap.size()==k)
        //         {
        //             result++;
        //         }
        //     }

        // }
        // return result;
        return atMost(nums,k)-atMost(nums,k-1);
    }
        public int atMost(int nums[],int k)
        {
            if(k<0)
            {
                return 0;
            }
            int l=0;
            HashMap<Integer,Integer> freqMap=new HashMap<>();
            int n=nums.length;
            int max=0;
            int result=0;
            for(int r=0;r<n;r++)
            {
                freqMap.put(nums[r],freqMap.getOrDefault(nums[r],0)+1);
                while(freqMap.size()>k)
                {
                    freqMap.put(nums[l],freqMap.get(nums[l])-1);
                    if(freqMap.get(nums[l])==0)
                    {
                        freqMap.remove(nums[l]);
                    }
                    l++;
                }
                result+=r-l+1;
            }
             return result;
        }
}