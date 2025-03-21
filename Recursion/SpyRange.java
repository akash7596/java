public class SpyRange {
  public static void main(String[] args) {
    Range(100, 1000);
  }

  public static void Range(int start, int end) {
    if (start > end) return;
    if (isSpy(start,start, 0, 1)) System.out.println(start);
    Range(start + 1, end);
  } 

  public static boolean isSpy(int n, int m, int sum, int product) {
    if (n == 0) return sum == product;
    sum += n % 10;
    product *= n % 10;
    return isSpy(n / 10, m, sum, product);
  } 
}
