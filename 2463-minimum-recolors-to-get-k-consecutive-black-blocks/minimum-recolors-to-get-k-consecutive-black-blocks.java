class Solution {
    public int minimumRecolors(String blocks, int k) {
        String winSub=blocks.substring(0,k);
        int noOfWhites=0;
        int noOfBlacks=0;
        int winStart=0;
        int minOperations=Integer.MAX_VALUE;
        for(int i=0;i<k;i++)
        {
            if(winSub.charAt(i)=='W')
            {
                noOfWhites++;
            }    
        }
        minOperations=Math.min(minOperations,noOfWhites);
        for(int i=k;i<blocks.length();i++)
        {
            winSub=winSub+blocks.charAt(i);
             if(winSub.charAt(winStart)=='W' && blocks.charAt(i)=='B')
             {
                noOfWhites--;

             }
             if(winSub.charAt(winStart)=='B' && blocks.charAt(i)=='W')
             {
                noOfWhites++;
             }
             minOperations=Math.min(minOperations,noOfWhites);
             winStart++;
             
        }
        return minOperations>0?minOperations:0;
       
    }
}