//import java.util.*;

class Node {
  int data;
  Node next;

  Node(int val) {
    data = val;
    next = null;
  }
}

class StackLinkedList {
  private Node top;

  public StackLinkedList() {
    top = null;
  }

  public void push(int x) {
    Node newNode = new Node(x);
    newNode.next = top;
    top = newNode;
  }

  public int pop() {
    if (top == null) {
      System.out.println("Stack Underflow");
      return -1;
    }
    int val = top.data;
    top = top.next;
    return val;
  }

  public int peek() {
    if (top == null) {
      System.out.println("Stack is empty");
      return -1;
    }
    return top.data;
  }

  public boolean isEmpty() {
    return top == null;
  }

  public void traverse() {
    if (top == null) {
      System.out.println("Stack is empty");
      return;
    }
    System.out.print("Stack elements: ");
    Node curr = top;
    while (curr != null) {
      System.out.print(curr.data + " ");
      curr = curr.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    StackLinkedList stack = new StackLinkedList();
    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.push(40);

    // Traverse stack
    stack.traverse();

    // Peek top element
    System.out.println("Top element: " + stack.peek());

    System.out.println("Popped: " + stack.pop());
    System.out.println("Popped: " + stack.pop());
    stack.traverse();
  }
}