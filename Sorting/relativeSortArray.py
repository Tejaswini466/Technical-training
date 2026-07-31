#1122
class Solution:
    def relativeSortArray(self, arr1, arr2):
        count={}
        for num in arr1:
            count[num]=count.get(num,0)+1
        res=[]
        for num in arr2:
            res.extend([num]*count.pop(num,0))
        for num in sorted(count.keys()):
            res.extend([num]*count[num])
        return res