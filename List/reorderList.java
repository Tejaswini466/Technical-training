
//LeetCode 143
import java.util.*;

class ListNode {
  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
  }
}

public class reorderList {
  public static void reorderList(ListNode head) {
    if (head == null || head.next == null)
      return;
    ListNode slow = head, fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    ListNode second = reverse(slow.next);
    slow.next = null;
    ListNode first = head;
    while (second != null) {
      ListNode tmp1 = first.next;
      ListNode tmp2 = second.next;

      first.next = second;
      second.next = tmp1;

      first = tmp1;
      second = tmp2;
    }
  }

  private static ListNode reverse(ListNode head) {
    ListNode prev = null, curr = head;
    while (curr != null) {
      ListNode next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    return prev;
  }

  public static void printList(ListNode head) {
    ListNode curr = head;
    System.out.print("[");
    while (curr != null) {
      System.out.print(curr.val);
      if (curr.next != null)
        System.out.print(", ");
      curr = curr.next;
    }
    System.out.println("]");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++)
      arr[i] = sc.nextInt();

    // Build linked list
    ListNode head = new ListNode(arr[0]);
    ListNode curr = head;
    for (int i = 1; i < n; i++) {
      curr.next = new ListNode(arr[i]);
      curr = curr.next;
    }

    // Reorder
    reorderList(head);

    // Print result
    printList(head);

    sc.close();
  }
}
