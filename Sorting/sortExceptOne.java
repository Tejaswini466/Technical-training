import java.util.*;

public class sortExceptOne {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    String[] parts = line.trim().split("\\s+");

    int n = parts.length;
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(parts[i]);
    }
    int loc = sc.nextInt();
    List<Integer> temp = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      if (i != loc) {
        temp.add(arr[i]);
      }
    }
    Collections.sort(temp);
    int j = 0;
    for (int i = 0; i < n; i++) {
      if (i == loc)
        continue;
      arr[i] = temp.get(j++);
    }

    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    sc.close();
  }
}