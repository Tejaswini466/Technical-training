import java.util.*;

class Node {
  int data;
  Node next;

  Node(int val) {
    data = val;
    next = null;
  }
}

public class add2Lists {
  public static Node addTwoNumbers(Node l1, Node l2) {
    Node dummy = new Node(0);
    Node curr = dummy;
    int carry = 0;

    while (l1 != null || l2 != null || carry != 0) {
      int sum = carry;
      if (l1 != null) {
        sum += l1.data;
        l1 = l1.next;
      }
      if (l2 != null) {
        sum += l2.data;
        l2 = l2.next;
      }

      carry = sum / 10;
      curr.next = new Node(sum % 10);
      curr = curr.next;
    }

    return dummy.next;
  }

  public static void printList(Node head) {
    System.out.print("[");
    Node curr = head;
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
    String line1 = sc.nextLine().replaceAll("[\\[\\]]", "");
    String[] parts1 = line1.split(",");
    Node l1 = new Node(Integer.parseInt(parts1[0]));
    Node curr = l1;
    for (int i = 1; i < parts1.length; i++) {
      curr.next = new Node(Integer.parseInt(parts1[i]));
      curr = curr.next;
    }
    String line2 = sc.nextLine().replaceAll("[\\[\\]]", "");
    String[] parts2 = line2.split(",");
    Node l2 = new Node(Integer.parseInt(parts2[0]));
    curr = l2;
    for (int i = 1; i < parts2.length; i++) {
      curr.next = new Node(Integer.parseInt(parts2[i]));
      curr = curr.next;
    }
    Node result = addTwoNumbers(l1, l2);
    printList(result);

    sc.close();
  }
}