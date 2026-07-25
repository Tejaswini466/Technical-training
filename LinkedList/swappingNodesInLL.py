#1721
class Solution:
    def swapNodes(self, head, k: int):
        first=head
        for i in range(k-1):
            first=first.next
        node1=first
        temp=first
        second=head
        while temp.next:
            temp=temp.next
            second=second.next
        node2=second
        node1.val,node2.val=node2.val,node1.val
        return head