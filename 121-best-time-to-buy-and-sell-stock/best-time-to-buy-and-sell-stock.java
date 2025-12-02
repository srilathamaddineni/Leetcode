class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int buying_price=prices[0];
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<buying_price)
            {
                buying_price=prices[i];
            }
            else
            {
                profit=Math.max(prices[i]-buying_price,profit);
            }
        }
          return profit; 
    }
}