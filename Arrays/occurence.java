import java.util.*;

public class occurence {
  public static int count(int[] arr, int k) {
    int count = 0;
    for (int num : arr) {
      if (num == k)
        count++;
    }
    return count;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n: ");
    int n = sc.nextInt();
    System.out.println("Enter array elements: ");
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter k: ");
    int k = sc.nextInt();
    System.out.println("Occurrences of " + k + " = " + count(arr, k));
    sc.close();
  }
}
