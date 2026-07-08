import java.util.*;

public class subarraySumSliding {
  public static int countSubarrays(int[] nums, int k) {
    int n = nums.length;
    int left = 0, right = 0, sum = 0, count = 0;
    while (right < n) {
      sum += nums[right];
      while (sum > k && left <= right) {
        sum -= nums[left];
        left++;
      }
      if (sum == k) {
        count++;
      }
      right++;
    }
    return count;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }
    sc.close();
    System.out.println(countSubarrays(nums, k));
  }
}