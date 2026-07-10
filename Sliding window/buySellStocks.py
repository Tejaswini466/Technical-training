#121
class Solution:
    def maxProfit(self, prices) -> int:
        min_,max_= float('inf'),0
        for price in prices:
            min_ = min(min_, price)
            max_profit = max(max_profit, price - min_)
        return max_profit