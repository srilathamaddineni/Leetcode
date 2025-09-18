class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int l=0;
        int r=n-1;
        int maxArea=Integer.MIN_VALUE;
        while(l<r)
        {
           int area=(r-l)*Math.min(height[l],height[r]);
           maxArea=Math.max(maxArea,area);
           if(height[l]<=height[r])
           {
             l++;
           }
           else
           {
             r--;
           }
        }
        return maxArea;
    }
}