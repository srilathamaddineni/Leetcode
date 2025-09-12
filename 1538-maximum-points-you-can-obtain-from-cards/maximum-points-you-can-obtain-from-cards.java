class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int l=0;
        int n=cardPoints.length;
        int lSum=0;
        int rSum=0;
        int maxSum=0;
        int winStart=k-1;
        for(int i=0;i<k;i++)
        {
            lSum+=cardPoints[i];
        }
        maxSum=lSum;
        for(int i=n-1;i>=n-k;i--)
        {
           lSum=lSum-cardPoints[winStart];
           rSum=rSum+cardPoints[i];
           int currSum=lSum+rSum;
           maxSum=Math.max(maxSum,currSum);
           System.out.println();
           winStart--;
        }
        return maxSum;

    }
}