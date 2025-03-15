class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        
        int maxProfit = 0;
        int minPrice = prices[0];

        for (int sellingPrice : prices) {
            maxProfit = Math.max(maxProfit, sellingPrice - minPrice);
            minPrice = Math.min(sellingPrice, minPrice);
        }
        
        return maxProfit;
    }
}
