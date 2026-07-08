import java.util.*;

class Solution {
  static int[] twoSum(int[] arr, int target) {
    Set<Integer> seen = new HashSet<>();
    for (int num : arr) {
      int complement = target - num;
      if (seen.contains(complement)) {
        return new int[] { complement, num };
      }
      seen.add(num);
    }
    return new int[0];
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] parts = sc.nextLine().trim().split("\\s+");
    int[] arr = new int[parts.length];
    for (int i = 0; i < parts.length; i++)
      arr[i] = Integer.parseInt(parts[i]);

    int target = sc.nextInt();
    int[] res = twoSum(arr, target);
    sc.close();
    if (res.length == 0) {
      System.out.print("[]");
    } else {
      if (res[0] > res[1]) {
        int temp = res[0];
        res[0] = res[1];
        res[1] = temp;
      }
      System.out.print("[" + res[0] + ", " + res[1] + "]");
    }
  }
}