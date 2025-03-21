public class StrongNumRange {
    public static void main(String[] args) {
        Range(100, 1000);
    }

    public static void Range(int start, int end) {
        if (start > end) return;
        if (isStrong(start, start, 0 )) System.out.println(start);
        Range(start + 1, end);
    }

    public static int fact(int n) {
        if (n == 0) return 1;
        return n * fact(n - 1);
    }

    public static boolean isStrong(int n, int m, int sum) {
        if (n == 0) return m == sum;
        sum += fact(n % 10);
        return isStrong(n / 10, m, sum);
    } 
}
