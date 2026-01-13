import java.util.*;

public class insertAtEnd {
  static class Node {
    int data;
    Node next;

    Node(int d) {
      data = d;
      next = null;
    }
  }

  static Node insertAtEnd(Node head, int x) {
    Node newNode = new Node(x);
    if (head == null)
      return newNode;

    Node curr = head;
    while (curr.next != null) {
      curr = curr.next;
    }
    curr.next = newNode;
    return head;
  }

  static void printList(Node head) {
    Node curr = head;
    while (curr != null) {
      System.out.print(curr.data);
      if (curr.next != null)
        System.out.print("->");
      curr = curr.next;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input size
    int n = sc.nextInt();

    // Build linked list
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
    int x = sc.nextInt();
    head = insertAtEnd(head, x);
    printList(head);
    sc.close();
  }
}