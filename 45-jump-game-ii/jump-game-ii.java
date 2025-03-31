class Solution {
    //As you are using recursion the TC will be exponential, you can optimize it to n^2 using DP we can further optimize it to 0(N) using range/greedy
    // public int minJumps(int[] nums,int jumps,int index)
    // {
    //     if(index>=nums.length-1)return jumps;
    //     int minimumJumps=Integer.MAX_VALUE;
    //     for(int i=1;i<=nums[index];i++)
    //     {
    //         minimumJumps=Math.min(minimumJumps,minJumps(nums,jumps+1,index+i));
    //     }
    //     return minimumJumps;
    // }

    public int jump(int[] nums) {
       int jumps = 0, farthest = 0, currentEnd = 0;
    
    for (int i = 0; i < nums.length - 1; i++) {
        farthest = Math.max(farthest, i + nums[i]);
        
        if (i == currentEnd) {
            jumps++;
            currentEnd = farthest;
        }
    }
    
    return jumps;

    }
}