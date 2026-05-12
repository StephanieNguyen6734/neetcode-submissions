class Solution {
    public int maxProfit(int[] prices) {
        // first we iterate with a for loop as our right pointer to sell
        // inside we constrained the left pointer if r < l, make l = r
        int buy = 0;
        int maxProfit = 0;

        for(int sell = 0; sell < prices.length; sell++){
            if(prices[sell] < prices[buy]) {
                buy = sell;
            }
            int profit = prices[sell] - prices[buy];

            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}
