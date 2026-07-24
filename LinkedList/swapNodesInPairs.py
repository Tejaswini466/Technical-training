#24
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None
class Solution:
    def swapPairs(self, head):
        dummy = ListNode(0)
        dummy.next = head
        prev = dummy
        while head and head.next:
            first = head
            second = head.next
            prev.next = second
            first.next = second.next
            second.next = first
            prev = first
            head = first.next
        return dummy.next
