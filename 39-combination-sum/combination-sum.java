class Solution {
    public void backtrack(int start,int[] arr,int remain, List<List<Integer>> result,List<Integer> comb)
    {
       if(remain<0)
         return;
       else if(remain==0)
          result.add(new ArrayList<>(comb));
        for(int i=start;i<arr.length;i++)
        {
            comb.add(arr[i]);
            backtrack(i,arr,remain-arr[i],result,comb);
            comb.remove(comb.size()-1);
        }
        
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> comb=new ArrayList<>();
        //Arrays.sort(candidates);
        backtrack(0,candidates,target,ans,comb);
        return ans;
    }
}