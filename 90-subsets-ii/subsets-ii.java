class Solution {
    public void findAllUniqueSubsets(int[] nums,int curr,List<Integer> li,List<List<Integer>> result)
    {//Using Set to store unique values gonna take extra time as we take extra time to convert set to list and adding to list Inserting into Set: O(2^n * n) ,Conversion from Set to List: O(2^n * n)
         result.add(new ArrayList<>(li));
        for(int i=curr;i<nums.length;i++)
        {
            if(i>curr && nums[i]==nums[i-1])continue;
              li.add(nums[i]);
              findAllUniqueSubsets(nums,i+1,li,result);
              li.remove(li.size()-1);
              
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        findAllUniqueSubsets(nums,0,new ArrayList<>(),result);
        return result;

    }
}