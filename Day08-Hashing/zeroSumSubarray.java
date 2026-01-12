import java.util.*;

public class zeroSumSubarray {
  public static boolean hasZeroSumSubarray(int[] nums) {
    Set<Integer> seen = new HashSet<>();
    int sum = 0;
    for (int num : nums) {
      sum += num;
      if (sum == 0 || seen.contains(sum)) {
        return true;
      }
      seen.add(sum);
    }
    return false;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }
    System.out.println(hasZeroSumSubarray(nums));
    sc.close();
  }
}