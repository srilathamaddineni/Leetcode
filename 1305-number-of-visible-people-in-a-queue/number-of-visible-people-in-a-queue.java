class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n=heights.length;
        int result[]=new int[n];
        Deque<Integer> stack=new ArrayDeque<>();
        for(int i=n-1;i>=0;i--)
        {
            int count=0;
            while(!stack.isEmpty() && stack.peek()<heights[i])
            {
                 count++;
                 stack.pop();
            }
            if(!stack.isEmpty())count++;
            result[i]=count;
            stack.push(heights[i]);
        }
       return result; 
    }
}