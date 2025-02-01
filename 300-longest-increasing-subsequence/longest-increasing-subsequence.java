class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> li=new ArrayList<>();
        int low=0;
        for(int i=0;i<nums.length;i++)
        {
           if(li.isEmpty() || li.get(li.size()-1)<nums[i])
           {
              li.add(nums[i]);
           }
           else
           {
            int idx=binarySearch(li,nums[i]);
            li.set(idx,nums[i]);
           }
        }
        return li.size();
    }
    public int binarySearch(List<Integer> arr,int target)
    {
        int left=0;
        int right=arr.size()-1;
        while(left<=right)
        {
            int mid=left+(right-left/2);
            if(arr.get(mid)==target)
               return mid;
            else if(arr.get(mid)>target)
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
            
        }
        return left;
    }
}