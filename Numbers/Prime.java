import java.util.*;

public class Prime {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    boolean flag = false;
    System.out.println("Enter a number: ");
    int num = sc.nextInt();
    if (num <= 1) {
      flag = false;
      System.out.print(num + " is not a prime number");
    } else {
      for (int i = 2; i < Math.sqrt(num); i++) {
        if (num % i == 0) {
          flag = true;
          break;
        }
      }
    }
    if (flag == true)
      System.out.print(num + " is not a prime number");
    else
      System.out.print(num + " is a prime number");
    sc.close();
  }
}
