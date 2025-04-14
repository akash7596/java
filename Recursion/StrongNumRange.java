class StrongNumRange{
 public static void main(String[] args) {
    range(100, 200); // smaller range for tracing
 } 
 public static void range(int start, int end) {
    if (start > end) return;
    if (isStrong(start, start, 0)) System.out.print(start + " ");
    range(start + 1, end);
 }
 public static boolean isStrong(int n, int original, int sum) {
    if (n == 0) return original == sum;
    int digit = n % 10;
    sum += factorial(digit);
    return isStrong(n / 10, original, sum);
 }
 public static int factorial(int n) {
  if (n == 0)return 1;
  return n * factorial(n - 1);
}

