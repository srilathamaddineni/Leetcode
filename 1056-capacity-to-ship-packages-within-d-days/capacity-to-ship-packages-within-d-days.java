class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        int weight=0;
        for(int i=0;i<weights.length;i++)
        {
            sum+=weights[i];
            max=Math.max(max,weights[i]);
        }

       while(max<=sum)
        {
            int mid=max+(sum-max)/2;
           if(noOfDays(weights,mid)<=days)
           {
             weight=mid;
             sum=mid-1;
           }
           else
           {
             max=mid+1;
           }
            
        }
        return weight;

    }
    public int noOfDays(int[] weights,int weight)
    {
        int noOfDays=1;//weight=10
        int cnt=0;
        int currentLoad=0;
        for(int i=0;i<weights.length;i++)
        {
           if(currentLoad+weights[i]>weight)
           {
              noOfDays++;
              currentLoad=0;
           }
           currentLoad+=weights[i];
        }
        return noOfDays;
    }
}