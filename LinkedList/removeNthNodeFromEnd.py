#19
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None
class Solution:
    def removeNthFromEnd(self, head, n: int):
        dummy=ListNode(0,head)
        slow=fast=dummy
        for i in range(n+1):
            fast=fast.next
        while fast:
            slow=slow.next
            fast=fast.next
        slow.next=slow.next.next
        return dummy.next