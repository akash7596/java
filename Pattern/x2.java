class X2 {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;
        char letter = 'A';

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    System.out.print(num + " ");  // Print numbers on main diagonal
                    num++;
                } else if (i + j == n + 1) {
                    System.out.print(letter + " ");  // Print letters on anti-diagonal
                    letter++;
                } else {
                    System.out.print("  ");  // Print spaces for alignment
                }
            }
            System.out.println();
        }
    }
}
