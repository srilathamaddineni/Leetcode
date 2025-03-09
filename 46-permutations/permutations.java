class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        backtrack(res,new ArrayList<>(),nums);
        return res;

    }
    public void backtrack(List<List<Integer>> res,List<Integer> permutation,int[] arr)
    {
        if(permutation.size()==arr.length)
        {
            res.add(new ArrayList<>(permutation));
            return;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(permutation.contains(arr[i]))continue;
            permutation.add(arr[i]);
            backtrack(res,permutation,arr);
             permutation.remove(permutation.size()-1);

        }
    }
}