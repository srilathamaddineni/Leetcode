class Solution {
    public int[][] merge(int[][] intervals) {
        int row=intervals.length;
        Arrays.sort(intervals, (a, b) ->Integer.compare(a[0],b[0]));
        int res[][]=new int[row][2];
        res[0][0]=intervals[0][0];
        res[0][1]=intervals[0][1];
        int j=0;
        for(int i=1;i<row;i++)
        {
           if(intervals[i][0]<=res[j][1])
           {
             res[j][1]=Math.max(intervals[i][1],res[j][1]);
           }
           else
           {
              j++;
              res[j][0]=intervals[i][0];
              res[j][1]=intervals[i][1];
           } 
        }
  
        int finRes[][]=new int[j+1][2];
        for(int i=0;i<=j;i++)
        {
           finRes[i][0]=res[i][0];
           finRes[i][1]=res[i][1];

        }
        return finRes;
    }
}