import java.util.Scanner;

public class Neon {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n = sc.nextInt();
    neon(n);
    sc.close();
  }

  public static void neon(int n) {
    int sq = n * n, sum = 0, r;
    while (sq != 0) {
      r = sq % 10;
      sum += r;
      sq /= 10;
    }
    if (sum == n)
      System.out.print("It is neon");
    else
      System.out.print("It is not neon");
  }
}