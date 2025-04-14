public class Pallendrom {
  public static void main(String[] args) {
    range(101, 500); // smaller range for tracing
  }

  public static void range(int start, int end) {
    if (start > end) return;
    if (isPallendrom(start, start, 0)) System.out.print(start + " ");
    range(start + 1, end);
  }

  public static boolean isPallendrom(int n, int original, int rev) {
    if (n == 0) return original == rev;
    rev = rev * 10 + (n % 10);
    return isPallendrom(n / 10, original, rev);
  }
}
