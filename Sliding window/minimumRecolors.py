from collections import Counter
class Solution:
    def minimumRecolors(self, blocks: str, k: int) -> int:
        counts=Counter(blocks[:k])
        min_op=counts["W"]
        for i in range(k,len(blocks)):
            counts[blocks[i]]+=1
            counts[blocks[i-k]]-=1
            min_op=min(min_op,counts["W"])
        return min_op