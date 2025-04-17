public class Automorphic {
  

  public static void main(String[] args) {
    
     range (1,100);
    }
    public static void range(int start, int end) {
      if (start > end) return;
      if (isAutomorphic(start)) System.out.print(start + " ");
      range(start + 1, end);
    }

  public static boolean isAutomorphic(int n) {
    return isAutomorphicHelper(n, n * n);
  }

  public static boolean isAutomorphicHelper(int n, int square) {
    // Base case: if n is 0, check if square ends with 0
    if (n == 0) return true ; 
    // Check if the last digit of square matches the last digit of n
    if (square % 10 != n % 10) return false;
    
    // Recursive case: remove last digit from both numbers and check again
    return isAutomorphicHelper(n / 10, square / 10);
  } 
}