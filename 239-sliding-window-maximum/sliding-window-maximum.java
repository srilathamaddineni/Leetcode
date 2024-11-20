class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        List<Integer> res=new ArrayList<>();
        Deque<Integer> q=new ArrayDeque<>();
        for(int i=0;i<n;i++)
        {
            while(!q.isEmpty() && nums[q.getLast()]<=nums[i])
            {
                q.removeLast();
            }
            q.addLast(i);
            if(q.getFirst()==i-k)
            {
                q.removeFirst();
            }
            if(i>=k-1)
            {
                res.add(nums[q.peek()]);
            }
        }
        
       int res1[]=new int[res.size()];
       for(int i=0;i<res1.length;i++)
       {
         res1[i]=res.get(i);
       }
       return res1;
    }
}