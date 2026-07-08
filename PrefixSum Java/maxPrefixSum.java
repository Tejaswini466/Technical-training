import java.util.*;

public class maxPrefixSum {
  public static int maxPrefixSum(int[] arr, int left, int right) {
    int maxSum = Integer.MIN_VALUE;
    int currentSum = 0;

    for (int i = left; i <= right; i++) {
      currentSum += arr[i];
      maxSum = Math.max(maxSum, currentSum);
    }
    return maxSum;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int x = sc.nextInt();
    for (int i = 0; i < x; i++) {
      int left = sc.nextInt();
      int right = sc.nextInt();
      int result = maxPrefixSum(arr, left, right);
      System.out.println(result);
    }
    sc.close();
  }
}