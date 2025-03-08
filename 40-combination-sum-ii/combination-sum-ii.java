class Solution {
     public List<List<Integer>> combinationSum2(int[] cand, int target) {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    Arrays.sort(cand);
    findComb(cand, 0, target, path, res);
    return res;
}
   public void findComb(int[] cand,int curr,int target,List<Integer> path,List<List<Integer>> result)
   {
   
        if(target==0)
        {
            result.add(new ArrayList<>(path));
            return;
        }
    for(int i=curr;i<cand.length;i++)
    {
        if(i>curr && cand[i]==cand[i-1])continue;
        if(cand[i]>target)break;
        path.add(cand[i]);
        findComb(cand,i+1,target-cand[i],path,result);
        path.remove(path.size()-1);
    }
    
   }
}