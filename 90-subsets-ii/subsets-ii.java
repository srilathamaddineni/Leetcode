class Solution {
    public void findAllUniqueSubsets(int[] nums,int curr,List<Integer> li,Set<List<Integer>> result)
    {
        if(curr==nums.length)
        {
            result.add(new ArrayList<>(li));
            return;
        }
        li.add(nums[curr]);
        findAllUniqueSubsets(nums,curr+1,li,result);
        li.remove(li.size()-1);
        findAllUniqueSubsets(nums,curr+1,li,result);

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> result=new HashSet<List<Integer>>();
        Arrays.sort(nums);
        findAllUniqueSubsets(nums,0,new ArrayList<>(),result);
        return new ArrayList<>(result);

    }
}