import java.util.*;

public class byDecFreq {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    String[] parts = line.trim().split("\\s+");

    int n = parts.length;
    Integer[] arr = new Integer[n];
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(parts[i]);
    }
    Map<Integer, Integer> freqMap = new HashMap<>();
    for (int num : arr) {
      freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
    }

    Arrays.sort(arr, (a, b) -> {
      int freqA = freqMap.get(a);
      int freqB = freqMap.get(b);
      if (freqA != freqB) {
        return freqB - freqA;
      } else {
        return a - b;
      }
    });

    for (int i = 0; i < n; i++) {
      System.out.print(arr[i]);
      if (i < n - 1)
        System.out.print(" ");
    }

    sc.close();
  }
}