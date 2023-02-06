package BestTimeToBuyAndSellStock;

public class Solution {
    public int maxProfit(int[] prices) {
   /*     int maxProfit = 0;
        for (int buyDay = 0; buyDay < prices.length; buyDay++) {

            for (int sellDay = buyDay; sellDay < prices.length; sellDay++) {
                int profit = prices[sellDay] - prices[buyDay];
                if (profit > maxProfit)
                    maxProfit = profit;

            }
        }


        return maxProfit;*/
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice)
                minPrice = prices[i];
            else if (prices[i] - minPrice > maxProfit)
                maxProfit = prices[i] - minPrice;
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(solution.maxProfit(prices));
    }
}
