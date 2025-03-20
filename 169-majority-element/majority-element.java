class Solution {
    public int majorityElement(int[] nums) {
        // Questions to be asked
        //    Are all the numbers positive
        //    length of the array range
    //     int n=nums.length;
    //     int ans=0;
    //    HashMap<Integer,Integer> map=new HashMap<>();
    //     for(int i=0;i<nums.length;i++)
    //     {
    //         map.put(nums[i],map.getOrDefault(nums[i],0)+1);
    //         if(map.get(nums[i])>n/2)
    //         {
    //             return nums[i];
    //         }
    //     }
    //     return ans;
       int cnt=0;
       int candidate=0;
       for(int num:nums)
       {
        if(cnt==0)
        {
            candidate=num;
        }
        if(num==candidate)
        {
            cnt++;
        }
        else
        {
            cnt--;
        }
       }
       return candidate;
    }
}