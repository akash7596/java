import java.util.Scanner;
class B 
{
	public static void main(String[] args) 
	{
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the Size");
		int n=scn.nextInt();

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
