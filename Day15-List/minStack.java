import java.util.*;

class MinStack {
  private Stack<Integer> stack;
  private Stack<Integer> minStack;

  public MinStack() {
    stack = new Stack<>();
    minStack = new Stack<>();
  }

  public void push(int x) {
    stack.push(x);
    if (minStack.isEmpty() || x <= minStack.peek()) {
      minStack.push(x);
    } else {
      minStack.push(minStack.peek());
    }
  }

  public void pop() {
    if (!stack.isEmpty()) {
      stack.pop();
      minStack.pop();
    }
  }

  public int top() {
    return stack.peek();
  }

  public int getMin() {
    return minStack.peek();
  }

  public static void main(String[] args) {
    MinStack minStack = new MinStack();

    minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);

    System.out.println("Min: " + minStack.getMin()); // -3
    minStack.pop();
    System.out.println("Top: " + minStack.top()); // 0
    System.out.println("Min: " + minStack.getMin()); // -2
  }
}
