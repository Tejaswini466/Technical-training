#1011
class Solution:
    def shipWithinDays(self, weights, days: int) -> int:
        l,r=max(weights),sum(weights)
        res=r
        while l<=r:
            mid=(l+r)//2
            if self.canShip(weights,days,mid):
                res=mid
                r=mid-1
            else:
                l=mid+1
        return res
    def canShip(self,weights,days,capacity):
        needed_days=1
        load=0
        for w in weights:
            if load+w>capacity:
                needed_days+=1
                load=0
            load+=w
        return needed_days<=days