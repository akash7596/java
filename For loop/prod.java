// Product of 1 to n natural number.
// Factorial of number.

import java.util.Scanner;
class Prod 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scn.nextInt();

		int prod=1;

			for (int i=1;i<=n ;i++ )
			{
				prod*=i;
			}
			System.out.println("Factorial of " +n+ "="+prod);
	}
}
