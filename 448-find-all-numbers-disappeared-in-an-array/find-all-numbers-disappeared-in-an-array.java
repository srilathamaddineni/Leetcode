class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        /*
        //Solution with using the extra space
        List<Integer> res=new ArrayList<>();
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=1;i<nums.length;i++)
        {
           map.putIfAbsent(nums[i],1);
        }
        for(int i=1;i<nums.length;i++)
        {
           if(!map.containsKey(i))
           {
            res.add(i);
           }
        }
        if(!map.containsKey(n))
        {
            res.add(n);
        }

      return res;*/
      //Solution Without using the extra space
      List<Integer> res=new ArrayList<>();
      for(int i=0;i<nums.length;i++)
      {
         int j=nums[i];
         if(j<0)
         {
            j*=-1;
         }
         if(nums[j-1]>0)
         {
            nums[j-1]*=-1;
         }
      }
      for(int i=0;i<nums.length;i++)
      {
        if(nums[i]>0)
        {
            res.add(i+1);
        }
      }
      return res;
    }
}