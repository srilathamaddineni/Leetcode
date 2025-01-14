class Solution {
    public int maxProfit(int[] prices) {
        int max_profit=0;
        int buy=prices[0];
        int sell=0;
        for(int i=1;i<prices.length;i++)
        {
            
            if(prices[i]>buy)
            {
                sell=prices[i];
                max_profit=Math.max(max_profit,sell-buy);
            }
           buy=Math.min(buy,prices[i]);
        }
        return max_profit;
    }
}