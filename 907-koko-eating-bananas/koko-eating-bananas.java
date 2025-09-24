class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int total=0;
       int low=0;
       int high=Arrays.stream(piles).max().getAsInt();
       int minSpeed=0;
       while(low<=high)
       {
         int mid=low+(high-low)/2;
         int totalhrs=totalHrsTaken(piles,mid);
         if(totalhrs<=h)
         {
           minSpeed=mid;
           high=mid-1;
         }
         else
         {
            low=mid+1;
         }
        
       }
       return minSpeed;
    }
    public int totalHrsTaken(int[] piles, int k)
    {
        int totalhrs=0;
        for(int i=0;i<piles.length;i++)
        {
           totalhrs+=Math.ceil((double)piles[i]/k);
        }
        return totalhrs;
    }
}