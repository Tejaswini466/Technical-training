import java.util.*;

class MyQueue {
  private Stack<Integer> s1;
  private Stack<Integer> s2;

  // Constructor
  public MyQueue() {
    s1 = new Stack<>();
    s2 = new Stack<>();
  }

  public void push(int x) {
    s1.push(x);
  }

  public int pop() {
    peek();
    return s2.pop();
  }

  public int peek() {
    if (s2.isEmpty()) {
      while (!s1.isEmpty()) {
        s2.push(s1.pop());
      }
    }
    return s2.peek();
  }

  // Returns whether the queue is empty
  public boolean empty() {
    return s1.isEmpty() && s2.isEmpty();
  }

  public static void main(String[] args) {
    MyQueue q = new MyQueue();

    q.push(1);
    q.push(2);
    q.push(3);

    System.out.println("Front element: " + q.peek()); // 1
    System.out.println("Pop: " + q.pop()); // 1
    System.out.println("Front element: " + q.peek()); // 2
    System.out.println("Pop: " + q.pop()); // 2
    System.out.println("Is empty? " + q.empty()); // false
    System.out.println("Pop: " + q.pop()); // 3
    System.out.println("Is empty? " + q.empty()); // true
  }
}
