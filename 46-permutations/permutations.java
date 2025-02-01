class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        backtrack(res,new ArrayList<>(),nums);
        return res;

    }
    public void backtrack(List<List<Integer>> res, List<Integer> li,int[] nums)
    {
        if(li.size()==nums.length)
        {
            res.add(new ArrayList<>(li));
        }
        else
        {
               for(int i=0;i<nums.length;i++)
               {
                if(li.contains(nums[i]))continue;
                li.add(nums[i]);
                backtrack(res,li,nums);
                li.remove(li.size()-1);
               }
        }
    }
}