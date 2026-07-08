import java.util.Scanner;

public class secondLargest {
  public static int secLargest(int[] arr) {
    if (arr.length < 2)
      return -1;
    int largest = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
    for (int num : arr) {
      if (num > largest) {
        second = largest;
        largest = num;
      } else if (num > second && num < largest) {
        second = num;
      }
    }
    return (second == Integer.MIN_VALUE) ? -1 : second;
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
    System.out.println("Second Largest = " + secLargest(arr));
    sc.close();
  }
}
