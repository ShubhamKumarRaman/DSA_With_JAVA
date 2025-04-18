public class J17StockBuySell {
    // Using check everday's Profit
    public static int usingCheckProfit(int price[]) {
        int profit = 0;
        for (int i = 0; i < price.length - 1; i++) {
            if (price[i] < price[i + 1]) {
                profit += price[i + 1] - price[i];
            }
        }
        return profit;
    }

    // [Naive Approach] Using Recursion – Exponential Time
    public static int usingRecursion(int prices[]) {
        return maxProfitRec(prices, 0, prices.length - 1);
    }

    public static int maxProfitRec(int[] prices, int start, int end) {
        int profit = 0;
        for (int i = start; i < end; i++) {
            for (int j = i + 1; j <= end; j++) {
                if (prices[j] > prices[i]) {
                    int current = (prices[j] - prices[i]) + maxProfitRec(prices, start, i - 1)
                            + maxProfitRec(prices, j + 1, end);
                    profit = Math.max(profit, current);
                }
            }
        }
        return profit;
    }

    public static void main(String args[]) {
        int[] prices = { 100, 180, 260, 310, 40, 535, 695 };
        System.out.println("Maximum Profit is: " + usingCheckProfit(prices));
        System.out.println("Maximum Profit is: "+usingRecursion(prices));
    }
}
