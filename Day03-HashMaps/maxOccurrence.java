import java.util.*;

public class maxOccurrence {
  public static int findMaxOccurrence(int[] arr) {
    HashMap<Integer, Integer> freqMap = new HashMap<>();

    for (int num : arr) {
      freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
    }

    int maxFreq = 0;
    int result = arr[0];
    for (int num : arr) {
      int count = freqMap.get(num);
      if (count > maxFreq) {
        maxFreq = count;
        result = num;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int result = findMaxOccurrence(arr);
    System.out.println("Max occurring number = " + result);
    sc.close();
  }
}