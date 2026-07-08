import java.util.*;

class MyStack {
  private Queue<Integer> q;

  public MyStack() {
    q = new LinkedList<>();
  }

  public void push(int x) {
    q.offer(x);
    for (int i = 0; i < q.size() - 1; i++) {
      q.offer(q.poll());
    }
  }

  public int pop() {
    return q.poll();
  }

  public int top() {
    return q.peek();
  }

  public boolean empty() {
    return q.isEmpty();
  }

  public static void main(String[] args) {
    MyStack stack = new MyStack();

    stack.push(1);
    stack.push(2);
    stack.push(3);

    System.out.println("Top element: " + stack.top()); // 3
    System.out.println("Pop: " + stack.pop()); // 3
    System.out.println("Pop: " + stack.pop()); // 2
    System.out.println("Is empty? " + stack.empty()); // false
    System.out.println("Pop: " + stack.pop()); // 1
    System.out.println("Is empty? " + stack.empty()); // true
  }
}
