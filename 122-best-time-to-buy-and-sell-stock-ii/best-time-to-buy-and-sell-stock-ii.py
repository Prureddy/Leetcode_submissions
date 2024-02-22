class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if not prices:
            return 0
        
        max_profit = 0
        for i in range(1,len(prices)):
            if prices[i-1] < prices[i]:
                max_profit = max_profit + prices[i] - prices[i-1]
        return max_profit

        
        