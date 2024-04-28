package blind75Programs;

public class BestTimeToBuyStocks2 {

	
	/*
	 * This program deals with buying and selling multiple times and reaching max
	 * profit That is the difference between program 1 and this
	 */
	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));
	}

	public static int maxProfit(int[] prices)
	{
		int maxProfit=0;
		
		for(int i=1;i<prices.length;i++)
		{
			if(prices[i]>prices[i-1])
				maxProfit += prices[i]-prices[i-1];
		}
		
		return maxProfit;
	}
}
