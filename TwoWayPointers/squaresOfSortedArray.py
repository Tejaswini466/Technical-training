class Solution:
    def sortedSquares(self, nums):
        l,r=0,len(nums)-1
        res=[0]*len(nums)
        pos=len(nums)-1
        while l<=r:
            if abs(nums[l])>abs(nums[r]):
                res[pos]=nums[l]**2
                l+=1
            else:
                res[pos]=nums[r]**2
                r-=1
            pos-=1
        return res