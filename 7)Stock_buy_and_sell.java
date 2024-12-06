class Solution {
    public int maximumProfit(int prices[]) {
        // code here
         int profit = 0;
         int n=prices.length;
        for (int i = 1; i < n; i++) {
            if (prices[i] > prices[i - 1])
                profit += prices[i] - prices[i - 1];
        }
        return profit;
    }
}
