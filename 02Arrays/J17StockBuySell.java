public class J17StockBuySell {
    public static int usingCheckProfit(int price[]) {
        int profit = 0;
        for (int i = 0; i < price.length - 1; i++) {
            if (price[i] < price[i + 1]) {
                profit += price[i + 1] - price[i];
            }
        }
        return profit;
    }

    public static void main(String args[]) {
        int[] prices = { 100, 180, 260, 310, 40, 535, 695 };
        System.out.println("Maximum Profit is: " + usingCheckProfit(prices));
    }
}
