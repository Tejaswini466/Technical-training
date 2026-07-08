import java.util.*;

class stackWithArray {
  private int top;
  private int[] arr;
  private int capacity;

  public stackWithArray(int size) {
    capacity = size;
    arr = new int[capacity];
    top = -1;
  }

  public void push(int x) {
    if (top == capacity - 1) {
      System.out.println("Stack Overflow");
      return;
    }
    arr[++top] = x;
  }

  public int pop() {
    if (top == -1) {
      System.out.println("Stack Underflow");
      return -1;
    }
    return arr[top--];
  }

  public int peek() {
    if (top == -1) {
      System.out.println("Stack is empty");
      return -1;
    }
    return arr[top];
  }

  public boolean isEmpty() {
    return top == -1;
  }

  public void traverse() {
    if (top == -1) {
      System.out.println("Stack is empty");
      return;
    }
    System.out.print("Stack elements: ");
    for (int i = 0; i <= top; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    stackWithArray stack = new stackWithArray(5);
    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.push(40);
    stack.traverse();

    System.out.println("Top element: " + stack.peek());

    System.out.println("Popped: " + stack.pop());
    System.out.println("Popped: " + stack.pop());

    stack.traverse();

    sc.close();
  }
}