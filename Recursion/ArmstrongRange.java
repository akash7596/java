//import java.util.Scanner;

class ArmstrongRange {
    public static void main(String[] args) {
        Range (100, 1000);
        }
    public static void Range(int start, int end) {
        if (start > end) return;
        if (isArmstrong(start, start, 0)) System.out.println(start);
        Range(start + 1, end);
    }

    public static int count(int n) {
        if (n == 0) return 0;
        return 1 + count(n / 10);
    }

    public static boolean isArmstrong(int n, int m, int sum) {
        if (n == 0) return m == sum;
        sum += (int) Math.pow(n % 10, count(m)); // Explicit cast to int
        return isArmstrong(n / 10, m, sum);
    }
}
