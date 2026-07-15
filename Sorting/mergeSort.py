class Solution:
    def sortArray(self, nums):
        if len(nums)<=1:
            return nums
        mid=len(nums)//2
        left_half=self.sortArray(nums[:mid])
        right_half=self.sortArray(nums[mid:])
        return self.merge(left_half,right_half)
    def merge(self,left,right):
        arr=[]
        i=j=0
        while i<len(left) and j<len(right):
            if left[i]<right[j]:
                arr.append(left[i])
                i+=1
            else:
                arr.append(right[j])
                j+=1
        arr.extend(left[i:])
        arr.extend(right[j:])
        return arr