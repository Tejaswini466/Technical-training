import java.util.*;

public class subarraySum {
  public static int subarraySum(int[] nums, int k) {
    Map<Integer, Integer> prefixCount = new HashMap<>();
    prefixCount.put(0, 1);

    int sum = 0, count = 0;
    for (int num : nums) {
      sum += num;
      if (prefixCount.containsKey(sum - k)) {
        count += prefixCount.get(sum - k);
      }
      prefixCount.put(sum, prefixCount.getOrDefault(sum, 0) + 1);
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
    System.out.println(subarraySum(nums, k));
  }
}