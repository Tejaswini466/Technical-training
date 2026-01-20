import java.util.*;

class stackWithArray {
  private int top;
  private int[] arr;
  private int capacity;

  // Constructor
  public stackWithArray(int size) {
    capacity = size;
    arr = new int[capacity];
    top = -1;
  }

  // Push operation
  public void push(int x) {
    if (top == capacity - 1) {
      System.out.println("Stack Overflow");
      return;
    }
    arr[++top] = x;
  }

  // Pop operation
  public int pop() {
    if (top == -1) {
      System.out.println("Stack Underflow");
      return -1;
    }
    return arr[top--];
  }

  // Peek operation
  public int peek() {
    if (top == -1) {
      System.out.println("Stack is empty");
      return -1;
    }
    return arr[top];
  }

  // Check if stack is empty
  public boolean isEmpty() {
    return top == -1;
  }

  // Traversal (print all elements)
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

    // Create stack of size 5
    stackWithArray stack = new stackWithArray(5);

    // Push elements
    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.push(40);

    // Traverse stack
    stack.traverse();

    // Peek top element
    System.out.println("Top element: " + stack.peek());

    // Pop elements
    System.out.println("Popped: " + stack.pop());
    System.out.println("Popped: " + stack.pop());

    // Traverse again
    stack.traverse();

    sc.close();
  }
}