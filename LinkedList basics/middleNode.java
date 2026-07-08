import java.util.*;

public class middleNode {
  static class Node {
    int data;
    Node next;

    Node(int d) {
      data = d;
      next = null;
    }
  }

  static Node middleNode(Node head) {
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  static void printList(Node head) {
    Node curr = head;
    System.out.print("[");
    while (curr != null) {
      System.out.print(curr.data);
      if (curr.next != null)
        System.out.print(",");
      curr = curr.next;
    }
    System.out.println("]");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Node head = null, tail = null;
    for (int i = 0; i < n; i++) {
      int val = sc.nextInt();
      Node newNode = new Node(val);
      if (head == null) {
        head = newNode;
        tail = newNode;
      } else {
        tail.next = newNode;
        tail = newNode;
      }
    }
    Node mid = middleNode(head);
    printList(mid);
    sc.close();
  }
}