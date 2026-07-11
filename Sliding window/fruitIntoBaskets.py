#904
from collections import defaultdict
class Solution:
    def totalFruit(self, fruits) -> int:
        l,res=0,0
        freq=defaultdict(int)
        for r in range(len(fruits)):
            freq[fruits[r]]+=1
            if len(freq)>2:
                freq[fruits[l]]-=1
                if freq[fruits[l]]==0:
                    del freq[fruits[l]]
                l+=1
            res=max(res,r-l+1)
        return res