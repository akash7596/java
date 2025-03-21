public class SumOfNum {

    public static void main(String[] args) {
        System.out.println(sum(23451));
    }

    public static int sum(int n) {
        if (n == 0) return 1;
        int a= n % 10 + sum(n / 10);
        if (a>9) return sum(a);
        return a;
    }
}