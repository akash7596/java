import java.util.Scanner;

class SmallestPerfectNumber
{
	public static boolean isPerfect(int n){
		if (n<2) return false;
	int sum=0;
		for (int i=1;i<=n/2 ;i++ )
		{
			if (n%i==0)
			{
				sum+=i;
			}
		}
		return sum==n;	
}

	public static void main(String[] args) 
	{
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter the start of range :");
		int start = scn.nextInt();
		System.out.println("Enter the end of range :");
		int end =scn.nextInt();

		for (int i=start;i<=end ;i++ )
		{
			if(isPerfect(i))
				{
					break;
				}
		}

		
			
	}
}
