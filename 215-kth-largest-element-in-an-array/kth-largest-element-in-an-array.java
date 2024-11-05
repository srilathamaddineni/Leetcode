class Solution {
    public int findKthLargest(int[] nums, int k) {
        /*Brute force
        int n=nums.length;
        Arrays.sort(nums);
        return nums[n-k];*/
        //Using Priority Queue
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++)
        {
            pq.add(nums[i]);
            if(pq.size()>k)
            {
                pq.poll();
            }
        }
        return pq.peek();
        
    }
}