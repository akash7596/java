public class HallowDiamond {
    public static void main(String[] args) {
        int n = 13;
        int sp = n /2;
        int st = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++)
                System.out.print(" ");
            for (int k = 1; k <= st; k++) {
                if (k == 1 || k == st)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
            if (i <= n/2) {
                sp--;
                st += 2;
            } else {
                sp++;
                st -= 2;
            }
        }
    }
}
