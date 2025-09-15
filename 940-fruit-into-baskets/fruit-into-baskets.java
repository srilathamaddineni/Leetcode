class Solution {
    public int totalFruit(int[] fruits) {
        // int basket1=-1;
        // int maxCnt=0;
        // if(fruits.length<=2)
        // {
        //     return fruits.length;
        // }
        // for(int i=0;i<fruits.length;i++)
        // {
        //     if (fruits.length - i <= maxCnt) break;
        //     basket1=fruits[i];
        //     int basket2=-1;
        //     int cnt=1;
        //     for(int j=i+1;j<fruits.length;j++)
        //     {
        //         if(basket2==-1 && fruits[j]!=basket1)
        //         {
        //             basket2=fruits[j];
        //             cnt++;
        //         }
        //         else if(fruits[j]==basket1 || fruits[j]==basket2)
        //         {
        //             cnt++;
        //         }
        //         else
        //         {
        //             break;
        //         }
        //         maxCnt=Math.max(maxCnt,cnt);

        //     }
        // }
        // return maxCnt;
        ///////////////////Sliding Window//////////////////////////
        int l=0;
        int n=fruits.length;
        int maxCnt=0;
        Map<Integer,Integer> freqMap=new HashMap<>();
        for(int r=0;r<n;r++)
        {
            freqMap.put(fruits[r],freqMap.getOrDefault(fruits[r],0)+1);
            while(freqMap.size()>2)
            {
                freqMap.put(fruits[l],freqMap.get(fruits[l])-1);     
                 if(freqMap.get(fruits[l])==0)
                {
                    freqMap.remove(fruits[l]);
                }
                l++;
               
            }
            maxCnt=Math.max(maxCnt,r-l+1);
        }
        return maxCnt;



    }
}