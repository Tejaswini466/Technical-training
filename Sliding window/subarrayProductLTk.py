#713
class Solution:
    def numSubarrayProductLessThanK(self, nums, k: int) -> int:
        l,res=0,0
        prod=1
        for r in range(len(nums)):
            prod*=nums[r]
            while prod>=k:
                prod//=nums[l]
                l+=1
            res+=r-l+1
        return res