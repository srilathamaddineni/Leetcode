class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> frequency=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            frequency.put(nums[i],frequency.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> queue=new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
        for(Map.Entry<Integer,Integer>val:frequency.entrySet())
        {
            queue.add(val);
            if(queue.size()>k)
            {
                queue.poll();
            }       
        }
        int arr[]=new int[k];
        for(int i=0;i<k;i++)
        {
            arr[i]=queue.poll().getKey();
        }
        return arr;
    }
}