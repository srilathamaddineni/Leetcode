class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(i>0 && nums[i]==nums[i-1]){
             continue;
            }
            int j=i+1;
            int k=n-1;
            while(j<k)
            {
                int total=nums[i]+nums[j]+nums[k];
                if(total<0)
                {
                    j++;
                }
                else if(total>0)
                {
                    k--;
                }
                else
                {
                    result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    while(nums[j]==nums[j-1] && j<k)
                    {
                        j++;
                    }
                }
            }
        }
        return result;

    }
}