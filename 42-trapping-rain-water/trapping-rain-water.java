class Solution {
    public int trap(int[] height) {
    //     int n=height.length;
    //     int maxLeft[]=new int[n];
    //     int maxRight[]=new int[n];
    //     int amtOfWater=0;
    //     maxLeft[0]=0;
    //     maxRight[n-1]=0;
    //     int left=height[0];
    //     int right=height[n-1];
    //     for(int i=1;i<n;i++)
    //     {
    //        maxLeft[i]=Math.max(maxLeft[i-1],left);
    //        left=height[i];
    //     }
    //     for(int i=n-2;i>=0;i--)
    //     {
    //         maxRight[i]=Math.max(maxRight[i+1],right);
    //         right=height[i];
    //     }
    //     for(int i=1;i<n-1;i++)
    //     {
    //         int currValue=Math.min(maxLeft[i],maxRight[i])-height[i];
    //         if(currValue>0)
    //         {
    //             amtOfWater+=currValue;
    //         }
    //     }

    //   return amtOfWater;
    int n=height.length;
     int leftMax=height[0];
     int rightMax=height[n-1];
     int left=0;
     int right=n-1;
     int res=0;
     while(left<right)
     {
           if(leftMax<rightMax)
           {
             left+=1;
             leftMax=Math.max(leftMax,height[left]);
             res+=leftMax-height[left];
           }
           else
           {
             right--;
             rightMax=Math.max(rightMax,height[right]);
             res+=rightMax-height[right];
           }
     }
     return res;

    }
}