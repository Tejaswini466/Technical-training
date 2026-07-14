#69
class Solution:
    def mySqrt(self, x: int) -> int:
        if x<2:
            return x
        l,r=0,x
        res=0
        while l<=r:
            mid=(l+r)//2
            sq=mid*mid
            if sq==x:
                return mid
            elif sq<x:
                res=mid
                l=mid+1
            else:
                r=mid-1
        return res