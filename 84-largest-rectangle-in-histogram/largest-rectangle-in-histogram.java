class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea=0;
        int n=heights.length;
        int NSR[]=new int[n];
        int NSL[]=new int[n];
        Stack<Integer> s=new Stack<>();
        NSL[0]=-1;
        s.push(0);
        for(int i=0;i<heights.length;i++)
        {
            while(!s.isEmpty() && heights[s.peek()]>=heights[i])
            {
                 s.pop();
            }
            if(s.isEmpty())
            {
                NSL[i]=-1;
            }else
            {
                NSL[i]=s.peek();
            }
            s.push(i);
        }
        s=new Stack<>();
        for(int i=n-1;i>=0;i--)
        {
            while(!s.isEmpty() && heights[s.peek()]>=heights[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                NSR[i]=n;
            }else
            {
                NSR[i]=s.peek();
            }
            s.push(i);
        }
        for(int i=0;i<n;i++)
        {
            int height=heights[i];
            int width=NSR[i]-NSL[i]-1;
            int currArea=height*width;
            if(currArea>maxArea)
            {
                maxArea=currArea;
            }
        }
        return maxArea;
    }
}