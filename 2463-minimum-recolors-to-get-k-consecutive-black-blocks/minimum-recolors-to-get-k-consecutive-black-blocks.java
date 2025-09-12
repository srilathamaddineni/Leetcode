class Solution {
    public int minimumRecolors(String blocks, int k) {
        String winSub=blocks.substring(0,k);
        int noOfWhites=0;
        int noOfBlacks=0;
        int winStart=0;
        int minOperations=Integer.MAX_VALUE;
        for(int i=0;i<k;i++)
        {
            if(blocks.charAt(i)=='W')
            {
                noOfWhites++;
            }    
        }
        minOperations=Math.min(minOperations,noOfWhites);
        for(int i=k;i<blocks.length();i++)
        {
            if (blocks.charAt(i - k) == 'W') noOfWhites--; // outgoing
            if (blocks.charAt(i) == 'W') noOfWhites++; 
             minOperations=Math.min(minOperations,noOfWhites);
             
        }
        return minOperations;
       
    }
}