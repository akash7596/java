import java.util.Scanner;

class PerfectNumber 
{
	public static void main(String[] args) 
	{
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = scn.nextInt();

		int sum=0;

		for (int i=1;i<=n/2 ;i++ )
		{
			if (n%i==0)
			{
				sum+=i;
			}
		}
		if (sum==n)
		{
			System.out.println("it is a perfect number");
		}
		else
			System.out.println("It is not a perfect number");
	}
}
