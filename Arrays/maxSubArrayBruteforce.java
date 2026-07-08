import java.util.Scanner;

public class maxSubArrayBruteforce {
  public static int maxSub(int[] arr, int n) {
    int maxSum = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      int currentSum = 0;
      for (int j = i; j < n; j++) {
        currentSum += arr[j];
        if (currentSum > maxSum) {
          maxSum = currentSum;
        }
      }
    }
    return maxSum;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n: ");
    int n = sc.nextInt();
    System.out.println("Enter array elements: ");
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Maximum Subarray Sum= " + maxSub(arr, n));
    sc.close();
  }
}