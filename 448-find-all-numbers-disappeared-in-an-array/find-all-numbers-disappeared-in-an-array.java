class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res=new ArrayList<>();
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
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

      return res;
    }
}