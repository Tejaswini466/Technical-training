import java.util.Scanner;

public class Armstrong {
  static int count(int num) {
    int count = 0;
    while (num > 0) {
      count++;
      num /= 10;
    }
    return count;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int num = sc.nextInt();
    int temp = num;
    int sum = 0;
    while (temp > 0) {
      int digit = temp % 10;
      sum += Math.pow(digit, count(num));
      temp /= 10;
    }
    if (sum == num)
      System.out.println(num + " is an Armstrong Number");
    else
      System.out.println(num + " is not an Armstrong Number");
    sc.close();
  }
}
