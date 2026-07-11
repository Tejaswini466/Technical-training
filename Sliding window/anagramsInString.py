#438
from collections import Counter
class Solution:
    def findAnagrams(self, s: str, p: str) :
        res=[]
        if len(p)>len(s):
            return res
        p_map=Counter(p)
        window=Counter(s[:len(p)])
        if p_map==window:
            res.append(0)
        for r in range(len(p),len(s)):
            window[s[r]]+=1
            window[s[r-len(p)]]-=1
            if window[s[r-len(p)]]==0:
                del window[s[r-len(p)]]
            if p_map==window:
                res.append(r-len(p)+1)
        return res