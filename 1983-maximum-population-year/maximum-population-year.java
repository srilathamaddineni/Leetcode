class Solution {
    public int maximumPopulation(int[][] logs) {
        // int earliestYear=Integer.MAX_VALUE;
        // int maxPopulation=Integer.MIN_VALUE;
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<logs.length;i++)
        // {
        //     int m=logs[i][0];
        //     int n=logs[i][1];
        //      for(int j=m;j<n;j++)
        //     {
        //         map.put(j,map.getOrDefault(j,0)+1);
        //         if(map.get(j)>=maxPopulation)
        //         {
        //             earliestYear=map.get(j)==maxPopulation?Math.min(j,earliestYear):j;
        //             maxPopulation=map.get(j);
                    
        //             System.out.println(maxPopulation);
        //         }
                
        //     }
        // }
        // return earliestYear;
        int year[]=new int[2051];
        for(int[] log:logs)
        {
            year[log[0]]+=1;
            year[log[1]]-=1;
        }
        int maxNum=year[1950], maxYear=1950;
        for(int i=1951;i<year.length;i++)
        {
            year[i]+=year[i-1];
            if(year[i]>maxNum)
            {
                maxNum=year[i];
                maxYear=i;
            }
        }
        return maxYear;
    }
}