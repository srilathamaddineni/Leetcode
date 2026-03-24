class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int[][] result=new int[intervals.length][2];
         int idx=0;
         result[0]=intervals[0];
         for(int i=1;i<intervals.length;i++)
         {
            if(result[idx][1]>=intervals[i][0])
            {
                result[idx][1]=Math.max(intervals[i][1],result[idx][1]);
            }
            else
            {
                result[++idx]=intervals[i];
            }
         }
         return Arrays.copyOfRange(result,0,idx+1);
    }
}