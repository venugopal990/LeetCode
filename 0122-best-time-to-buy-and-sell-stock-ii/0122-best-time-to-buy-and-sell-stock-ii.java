class Solution {
    public int maxProfit(int[] prices) {
        int buyStock = prices[0];
		int profit = 0;
		int finalProfit = 0;
		for (int i = 1; i < prices.length; i++) {

			if(prices[i] > buyStock  ) {
				if((prices[i]-buyStock) < profit && profit!=0) {
					finalProfit+=profit;
					buyStock = prices[i];
					profit=0;
				}
				profit = Math.max(profit, (prices[i]-buyStock));
			}else {
				finalProfit+=profit;
				profit=0;
				buyStock = prices[i];
			}
		}
		if(profit!=0) {
			finalProfit+=profit;
		}
		return finalProfit;
    }
}