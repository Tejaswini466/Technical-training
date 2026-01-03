import java.util.Scanner;

public class largest {
  public static int large(int[] arr) {
    int max = arr[0];
    for (int num : arr) {
      if (num > max)
        max = num;
    }
    return max;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n: ");
    int n = sc.nextInt();
    System.out.println("Enter array elements: ");
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Largest = " + large(arr));
    sc.close();
  }
}