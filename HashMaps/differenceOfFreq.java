import java.util.HashMap;

public class differenceOfFreq {
  public static int frequencyGap(int[] arr) {
    HashMap<Integer, Integer> freqMap = new HashMap<>();

    // Count frequencies
    for (int num : arr) {
      freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
    }

    int maxFreq = Integer.MIN_VALUE;
    int minFreq = Integer.MAX_VALUE;

    // Find max and min frequency
    for (int count : freqMap.values()) {
      if (count > maxFreq)
        maxFreq = count;
      if (count < minFreq)
        minFreq = count;
    }

    return maxFreq - minFreq;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 3, 2, 3, 4, 3, 2 };
    System.out.println("Difference = " + frequencyGap(arr));
  }
}