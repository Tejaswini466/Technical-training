import java.util.*;

public class searchKey {
  static class Node {
    int data;
    Node next;

    Node(int d) {
      data = d;
      next = null;
    }
  }

  static boolean searchKey(Node head, int key) {
    Node curr = head;
    while (curr != null) {
      if (curr.data == key) {
        return true;
      }
      curr = curr.next;
    }
    return false;
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
    System.out.println(searchKey(head, key));
    sc.close();
  }
}