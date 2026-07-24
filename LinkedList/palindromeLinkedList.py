#234
class Solution:
    def isPalindrome(self, head) -> bool:
        if not head or not head.next:
            return True
        slow=fast=head
        while fast and fast.next:
            slow=slow.next
            fast=fast.next.next
        prev=None
        curr=slow
        while curr:
            nxt=curr.next
            curr.next=prev
            prev=curr
            curr=nxt
        l,r=head,prev
        while r:
            if l.val!=r.val:
                return False
            l=l.next
            r=r.next
        return True