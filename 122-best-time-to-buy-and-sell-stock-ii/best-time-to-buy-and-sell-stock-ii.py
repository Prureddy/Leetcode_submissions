class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit = 0 
        last_buy = prices[0]

        for sell in prices:
            if sell < last_buy:
                last_buy = sell 
            
            if sell - last_buy > 0:
                profit += (sell - last_buy) 
                last_buy = sell 

        return profit