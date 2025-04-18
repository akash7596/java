import java.util.Scanner;

class PrimeNum
{
	public static void main(String[]args)
		{
		Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scn.nextInt();

        int i = 2;

        boolean flag = true;
        
        while (i <= n / 2)
        {
            if (n % i == 0)
            {
                flag = false; // If `n` is divisible by `i`, it's not prime
                break; // Exit the loop early
            }
            i++; // Move to the next number
        }
        
        if (n > 1 && flag)
        {
            System.out.println("It is a prime number.");
        }
        else
        {
            System.out.println("It is not a prime number.");
        }
    }
}



// We take an input number n from the user.
// We assume it is prime (flag = true).
// We loop i from 2 to n / 2:
// If n is divisible by any i, flag = false and we break the loop.
// After the loop:
// If n > 1 and flag is still true, the number is prime.
// Otherwise, it's not prime.