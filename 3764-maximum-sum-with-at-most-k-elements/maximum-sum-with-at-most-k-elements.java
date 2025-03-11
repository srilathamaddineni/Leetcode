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
       if(k == 0) {
    return 0;
}

PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);

for (int i = 0; i < grid.length; i++) {
    // Instead of using a max-heap, sort the row and take the top `limits[i]` elements
    Arrays.sort(grid[i]);

    // Add the largest `limits[i]` elements to the minHeap
    int cnt = Math.min(limits[i], grid[i].length);
    for (int j = grid[i].length - 1; j >= grid[i].length - cnt; j--) {
        if (minHeap.size() < k) {
            minHeap.add(grid[i][j]);
        } else if (grid[i][j] > minHeap.peek()) {
            minHeap.poll();
            minHeap.add(grid[i][j]);
        }
    }
}

long sum = 0;
while (!minHeap.isEmpty()) {
    sum += minHeap.poll();
}
return sum;
    }
}