import java.util.*;

public class linkedListCycle {
  static class Node {
    int data;
    Node next;

    Node(int d) {
      data = d;
      next = null;
    }
  }

  static int hasCycle(Node head) {
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

      if (slow == fast) {
        return 1;
      }
    }
    return 0;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++)
      arr[i] = sc.nextInt();
    Node head = null, tail = null;
    for (int val : arr) {
      Node newNode = new Node(val);
      if (head == null) {
        head = newNode;
        tail = newNode;
      } else {
        tail.next = newNode;
        tail = newNode;
      }
    }
    int pos = sc.nextInt();
    if (pos != -1) {
      Node cycleNode = head;
      for (int i = 0; i < pos; i++) {
        cycleNode = cycleNode.next;
      }
      tail.next = cycleNode;
    }
    System.out.println(hasCycle(head));
    sc.close();
  }
}