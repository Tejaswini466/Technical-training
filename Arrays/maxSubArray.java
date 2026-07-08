//Finding Max SubArray from an array using Kadane's algorithm

import java.util.Scanner;

public class maxSubArray {
  public static int maxSub(int[] nums, int n) {
    int current = nums[0], max = nums[0];
    for (int i = 1; i < n; i++) {
      current = Math.max(nums[i], current + nums[i]);
      max = Math.max(max, current);
    }
    return max;
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