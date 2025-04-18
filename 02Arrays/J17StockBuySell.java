public class J17StockBuySell {
    // Using check everday's Profit-
    // [Expected Approach] Accumulate Profit – O(n) Time and O(1) Space
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

    // [Better Approach] Local Minima and Maxima – O(n) Time and O(1) Space
    public static int usingMinimaMaxima(int[] prices) {
        int n = prices.length;
        int Minima = prices[0];
        int Maxima = prices[0];
        int profit = 0;
        int i = 0;
        while (i < n - 1) {
            // Find minima
            while (i < n - 1 && prices[i] >= prices[i + 1])
                i++;
            Minima = prices[i];

            // Find Maxima
            while (i < n - 1 && prices[i] <= prices[i + 1])
                i++;
            Maxima = prices[i];

            // calculate profit
            profit += Maxima - Minima;
        }
        return profit;
    }

    public static void main(String args[]) {
        int[] prices = { 100, 180, 260, 310, 40, 535, 695 };
        System.out.println("Maximum Profit is: " + usingCheckProfit(prices));
        System.out.println("Maximum Profit is: " + usingRecursion(prices));
        System.out.println("Maximum Profit is: " + usingMinimaMaxima(prices));
    }
}
