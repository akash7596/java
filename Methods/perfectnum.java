import java.util.Scanner;

class SmallestPerfectNumber {
    // Function to check if a number is a perfect number
    public static boolean isPerfect(int n) {
        if (n < 2) return false; // Perfect numbers are greater than 1

        int sum = 1; // 1 is always a divisor
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) {
                    sum += n / i; // Add both divisors
                }
            }
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the start of the range: ");
        int start = scn.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = scn.nextInt();
        scn.close();
  
        int smallestPerfect = -1; // Default to -1 if no perfect number is found

        for (int i = start; i <= end; i++) {
            if (isPerfect(i)) {
				System.out.print(i+"");
                //smallestPerfect = i;
                break; // Stop at the first perfect number (smallest in range)
            }
        }

       /* if (smallestPerfect != -1) {
            System.out.println("The smallest perfect number in the range is: " + smallestPerfect);
        } else {
            System.out.println("No perfect number found in the given range.");
        }*/
    }
}
