class Solution {
    public int change(int amount, int[] coins) {
        int dp[]=new int[amount+1];
        dp[0]=1;
       
        for(int i=0;i<coins.length;i++)
        {
            int k=coins[i];
            for(int j=k;j<=amount;j++)
            {
                dp[j]+=dp[j-k];
            }
        }
        return dp[amount];

    }
    

}