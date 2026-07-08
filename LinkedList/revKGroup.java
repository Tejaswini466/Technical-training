import java.util.*;

class Node {
  int data;
  Node next;

  Node(int val) {
    data = val;
    next = null;
  }
}

public class revKGroup {
  public static Node reverseKGroup(Node head, int k) {
    if (head == null)
      return null;
    Node curr = head;
    int count = 0;
    while (curr != null && count < k) {
      curr = curr.next;
      count++;
    }
    if (count < k)
      return head;
    curr = head;
    Node prev = null;
    Node next = null;
    count = 0;
    while (curr != null && count < k) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
      count++;
    }
    head.next = reverseKGroup(curr, k);
    return prev;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    int k = sc.nextInt();
    Node head = new Node(a[0]);
    Node curr = head;
    for (int i = 1; i < n; i++) {
      curr.next = new Node(a[i]);
      curr = curr.next;
    }
    Node result = reverseKGroup(head, k);
    while (result != null) {
      System.out.print(result.data + " ");
      result = result.next;
    }
    sc.close();
  }
}