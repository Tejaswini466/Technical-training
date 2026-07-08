import java.util.*;

public class halfSort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    String[] parts = line.trim().split("\\s+");

    int n = parts.length;
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(parts[i]);
    }
    int mid = n / 2;
    Arrays.sort(arr, 0, mid);
    Arrays.sort(arr, mid, n);
    for (int i = mid, j = n - 1; i < j; i++, j--) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }

    for (int i = 0; i < n; i++) {
      System.out.print(arr[i]);
      if (i < n - 1)
        System.out.print(" ");
    }
    sc.close();
  }
}