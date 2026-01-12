import java.util.*;

public class subarraySumDivByk {
  public static int subarraysDivByK(int[] nums, int k) {
    Map<Integer, Integer> remainderCount = new HashMap<>();
    remainderCount.put(0, 1);
    int sum = 0, count = 0;
    for (int num : nums) {
      sum += num;
      int remainder = sum % k;
      if (remainder < 0)
        remainder += k;
      if (remainderCount.containsKey(remainder))
        count += remainderCount.get(remainder);
      remainderCount.put(remainder, remainderCount.getOrDefault(remainder, 0) + 1);
    }
    return count;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }
    int k = sc.nextInt();
    System.out.println(subarraysDivByK(nums, k));
    sc.close();
  }
}