import java.util.Scanner;
class A 
{
	public static void main(String[] args) 
	{
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter Size");
		int n =scn.nextInt();
		int a=scn.nextInt();

		for (int i=1;i<=n ;i++ )
		{
			for (int j=1;j<=i ;j++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}


	}
}
