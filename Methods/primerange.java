import java.util.Scanner;
class PrimeRange 
{
	public static boolean isPrime(int n)
		{
			if (n<=1)return false;
			for (int i=2;i<=n/2 ;i++ )
			{
				if(n%i==0)return false;
			}
			return true;
		}
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Range");
		int start=scn.nextInt();
		int end=scn.nextInt();

		for(int i=start; i<=end; i++){
			if (isPrime(i))System.out.println(i);
		}
	}
}
