class Solution:
    def sortArray(self, nums):
        n=len(nums)
        for i in range(len(nums)):
            for j in range(0,n-i-1):
                if nums[j]>nums[j+1]:
                    nums[j],nums[j+1]=nums[j+1],nums[j]
        return nums