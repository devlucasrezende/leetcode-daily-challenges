import java.util.Arrays;

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
            int potencialProfitForThisDay = price - minPrice;
            if (potencialProfitForThisDay > maxProfit) {
                maxProfit = potencialProfitForThisDay;
            }
        }
        return maxProfit;
    }


}
