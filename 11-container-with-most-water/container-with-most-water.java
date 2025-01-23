class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int maxArea=Integer.MIN_VALUE;
        while(left<right)
        {
            int area=(Math.min(height[left],height[right]))*(right-left);
            System.out.println(area);
            maxArea=Math.max(maxArea,area);
            if(height[left]<height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return maxArea;
    }
}