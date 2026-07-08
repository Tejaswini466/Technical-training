import java.util.*;

public class reverseList {
  static class Node {
    int data;
    Node next;

    Node(int d) {
      data = d;
      next = null;
    }
  }

  static Node reverseList(Node head) {
    Node prev = null;
    Node curr = head;
    while (curr != null) {
      Node next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    return prev;
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
    head = reverseList(head);
    printList(head);
    sc.close();
  }
}
