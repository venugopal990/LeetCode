class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int stockPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] > stockPrice) {
                maxProfit = Math.max(maxProfit, (prices[i] - stockPrice));
            } else {
                stockPrice = prices[i];
            }

        }

        return maxProfit;
    }
}