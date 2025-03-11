class Solution {
    public long maxSum(int[][] grid, int[] limits, int k) {
        // List<Integer> li=new ArrayList<>();
        // long sum=0;
        
        // for(int i=0;i<grid.length;i++)
        // {   int arr[]=new int[grid[i].length];
        //     for(int j=0;j<grid[i].length;j++)//n
        //     {
        //         arr[j]=grid[i][j];
        //     }
        //    Arrays.sort(arr);//mlogn
        //    for(int p=0;p<Math.min(limits[i],arr.length);p++)//m
        //    {
        //       li.add(arr[arr.length - 1 - p]);
        //    }
         
        // }
        // Collections.sort(li, Collections.reverseOrder());
        // for(int i=0;i<Math.min(k,li.size());i++)
        // {
        //     sum+=li.get(i);
        // }
        // return sum;
        //Optimized Version
        if(k==0)
        {
            return 0;
        }
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        for(int i=0;i<grid.length;i++)
        {
            PriorityQueue<Integer> rowMaxHeap=new PriorityQueue<>(Collections.reverseOrder());
            for(int j=0;j<grid[i].length;j++)
            {
                rowMaxHeap.add(grid[i][j]);
            }
            int cnt=Math.min(limits[i],grid[i].length);
            for(int p=0;p<cnt;p++)
            {
                if(rowMaxHeap.size()==0)
                  break;
                int val=rowMaxHeap.poll();
                if(minHeap.size()<k)
                {
                    minHeap.add(val);
                }
                else if(val>minHeap.peek())
                   {
                      minHeap.poll();
                      minHeap.add(val);
                   }
                
            }
        }
        long sum=0;
        while(!minHeap.isEmpty())
        {
            sum+=minHeap.poll();
        }
        return sum;
    }
}