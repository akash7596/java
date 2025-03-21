import java.util.Scanner;
class Lcm 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter two number:");

		int n=scn.nextInt();
		int m=scn.nextInt();

		int i=1;

		while ( true )//i<=n*m
		{
			if (i%n==0 && i%m==0)
			{
				System.out.println("LCM IS="+i);
				break;
			}
			i++;
		}
	}
}
