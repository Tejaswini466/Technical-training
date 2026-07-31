#25
class ListNode:
    def __init__(self, val=0, next=None):
      self.val = val
      self.next = next
class Solution:
    def reverseKGroup(self, head, k: int):
        def reverse(start,end):
            prev,curr=None,start
            while curr!=end:
                nxt=curr.next
                curr.next=prev
                prev=curr
                curr=nxt
            return prev
        dummy=ListNode(0)
        dummy.next=head
        group_prev=dummy
        while True:
            kth=group_prev
            for i in range(k):
                kth=kth.next
                if not kth:
                    return dummy.next
            group_next=kth.next

            start=group_prev.next
            end=group_next
            new_head=reverse(start,end)

            group_prev.next=new_head
            start.next=group_next
            group_prev=start