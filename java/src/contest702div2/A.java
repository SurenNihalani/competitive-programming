package contest702div2;

import java.util.Scanner;


public class A {
  private static Scanner scanner;

  public static void main(String[] a) {
    scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    while (t-- > 0) {
      solve();
    }
  }

  private static void solve() {
    long a = scanner.nextInt();
    long b = scanner.nextInt();
    long ans = Long.MAX_VALUE;
    for (int i = 0; i < 100; i++) {
      long steps = i;
      long newB = b + i;
      if (newB == 1) {
        continue;
      }
      for (long newA = a; newA > 0; newA /= newB, steps++) {

      }
      ans = Math.min(ans, steps);
    }
    System.out.println(ans);
  }
}
