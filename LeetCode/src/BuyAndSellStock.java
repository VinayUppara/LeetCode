

public class BuyAndSellStock {



	static public void main(String...strings) {
		int[] prices = {4,6,11,9,5};
		//System.out.println(new BuyAndSellStock().maxProfit(prices));
		System.out.println(new BuyAndSellStock().maxProfitMultiple(prices));
	}

	public int maxProfit(int[] prices) {
		int profit = 0;

		for (int i=1; i < prices.length; i++) {
			for (int j = 0; j < i; j++) {
				int diff =prices[i]-prices[j]; 
				if(diff>0&&diff>profit) {
					profit = diff;

				}
			}				
		}
		return profit;

	}
	
	public int maxProfitMultiple(int[] prices) {
		 int i = 0, buy, sell, profit = 0, N = prices.length - 1;
	        while (i < N) {
	            while (i < N && prices[i + 1] <= prices[i])
	            	{
	            	i++;
	            	}
	            buy = prices[i];

	            while (i < N && prices[i + 1] > prices[i])
	            	{
	            	i++;
	            	}
	            sell = prices[i];

	            profit += sell - buy;
	        }
	        return profit;

	}
}