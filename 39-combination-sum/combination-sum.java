class Solution {
    public void findComb(int start,int[] arr,int remain, List<List<Integer>> result,List<Integer> comb)
    {
      if(start==arr.length)
      {
         if(remain==0)
         {
          result.add(new ArrayList<>(comb));
         }
         return;
         
      }
      if(arr[start]<=remain)
      {
         comb.add(arr[start]);
         findComb(start,arr,remain-arr[start],result,comb);
         comb.remove(comb.size()-1);

      }
       findComb(start+1,arr,remain,result,comb);
        
        
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> comb=new ArrayList<>();
        //Arrays.sort(candidates);
        findComb(0,candidates,target,ans,comb);
        return ans;
    }
}