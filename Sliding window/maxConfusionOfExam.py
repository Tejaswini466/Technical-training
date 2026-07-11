#2024
class Solution:
    def maxConsecutiveAnswers(self, answerKey: str, k: int) -> int:
        def run(target):
            l,flips,res=0,0,0
            for r in range(len(answerKey)):
                if answerKey[r]!=target:
                    flips+=1
                while flips>k:
                    if answerKey[l]!=target:
                        flips-=1
                    l+=1
                res=max(res,r-l+1)
            return res
        return max(run('T'),run('F'))