package org.example.best.time.to.buy.and.sell.stock;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int temProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] - prices[i] > 0) {
                    temProfit = prices[j] - prices[i];
                }
                if (profit <= temProfit) {
                    profit = temProfit;
                }
            }
        }
        return profit;
    }

    public int maxProfit2(int[] prices) {
        int profit = 0;
        int tempProfit = 0;
        int minPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (minPrice > prices[i]) {
                minPrice = prices[i];
            }

            tempProfit = prices[i] - minPrice;
            if (tempProfit>profit){
                profit=tempProfit;
            }
        }
        return profit;
        //  return 0;
    }

}
