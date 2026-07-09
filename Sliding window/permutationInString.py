from collections import Counter
class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        m,n=len(s1),len(s2)
        if n<m:
            return False
        s1_count=Counter(s1)
        window=Counter(s2[:m])
        if s1_count==window:
            return True
        for i in range(m,n):
            window[s2[i]]+=1
            window[s2[i-m]]-=1
            if window[s2[i-m]]==0:
                del window[s2[i-m]]
            if window==s1_count:
                return True
        return False