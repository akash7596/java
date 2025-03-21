import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(); // Example: 153
        sc.close();

        int m = n;
        int count = 0;

        // Count the number of digits
        while (m > 0) {
            count++;
            m /= 10;
        }
				System.out.println("count="+count);
				System.out.println("--------------");
        m = n; // Reset m to original number
        int sum = 0;

        // Compute the Armstrong sum
        while (m > 0) {
            int d = m % 10;
						System.out.println("d="+d);
						System.out.println("--------------");

            int prod = 1;

            // Compute d^count
            for (int i = 0; i < count; i++) {
                prod *= d;
            }
						System.out.println("prod="+prod);
						System.out.println("===========");
            sum += prod;
            m /= 10;
        }
				System.out.println("sum="+sum);
				System.out.println("--------------");


        // Check if the number is Armstrong
        if (sum == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is NOT an Armstrong number.");
        }
    }
}
