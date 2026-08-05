#496
class Solution:
    def nextGreaterElement(self, nums1, nums2):
        nxt_greater={}
        stack=[]
        for num in nums2:
            while stack and num>stack[-1]:
                nxt_greater[stack.pop()]=num
            stack.append(num)
        while stack:
            nxt_greater[stack.pop()]=-1
        return [nxt_greater[num] for num in nums1]