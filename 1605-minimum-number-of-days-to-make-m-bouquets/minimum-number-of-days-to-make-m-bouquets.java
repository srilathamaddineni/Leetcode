class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int high=Integer.MIN_VALUE;
        int low=Integer.MAX_VALUE;
        int n=bloomDay.length;
        int ans=-1;
        if(n<m*k)
        {
            return -1;
        }
        for(int i=0;i<bloomDay.length;i++)
        {
            high=Math.max(high,bloomDay[i]);
            low=Math.min(low,bloomDay[i]);

        }
       while(low<=high)
       {
         int mid=low+(high-low)/2;
         if(possibleOrNot(bloomDay,mid,m,k))
         {
             ans=mid;
             high=mid-1;
         }
         else
         {
            low=mid+1;
         }
       }
       return ans;
        
    }
    public boolean possibleOrNot(int bloomDay[],int day,int m,int k)
    {
        int noOfBoq=0;
        int cnt=0;
        int n=bloomDay.length;
        for(int i=0;i<n;i++)
        {
            if(bloomDay[i]<=day)
            {
                cnt++;
            }
            else
            {
                noOfBoq+=cnt/k;
                cnt=0;
            }
        }
        noOfBoq+=cnt/k;
        if(noOfBoq>=m)
        {
            return true;
        }
        return false;
    }
}