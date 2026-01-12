import java.util.*;

public class movingZeroes {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int size = n;
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
    n = remove(arr, n);
    for (int i = 0; i < size; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static int remove(int a[], int n) {
    int pos = 0;
    for (int i = 0; i < n; i++) {
      if (a[i] != 0) {
        a[pos] = a[i];
        pos++;
      }
    }
    while (pos < n) {
      a[pos] = 0;
      pos++;
    }
    return n;
  }
}