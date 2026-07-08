import java.util.*;

public class deleteNode {
  static class Node {
    int data;
    Node next;

    Node(int d) {
      data = d;
      next = null;
    }
  }

  static Node deleteNode(Node head, int key) {
    if (head == null)
      return null;
    if (head.data == key) {
      return head.next;
    }

    Node curr = head;
    while (curr.next != null) {
      if (curr.next.data == key) {
        curr.next = curr.next.next;
        break;
      }
      curr = curr.next;
    }
    return head;
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
    int key = sc.nextInt();
    head = deleteNode(head, key);
    printList(head);
    sc.close();
  }
}