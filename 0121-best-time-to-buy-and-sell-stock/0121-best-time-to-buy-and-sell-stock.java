class Solution {
    public int maxProfit(int[] prices) {
       int currentSum = 0;
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - prices[i - 1];
            currentSum = Math.max(profit, currentSum + profit);
            maxProfit = Math.max(maxProfit, currentSum);
        }

        return maxProfit;
    }
}