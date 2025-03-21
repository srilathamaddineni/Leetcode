class Solution {
    public int maxProfit(int[] prices) {
        int Selling_Price=0;
        int buyingPrice=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]>buyingPrice)
            {
                profit=Math.max(profit,prices[i]-buyingPrice);
            }
            else
            {
                buyingPrice=prices[i];
            }
        }
        return profit;
    }
}