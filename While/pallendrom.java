import java.util.Scanner;
class Pallendrom 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Hello World!");
		int n=scn.nextInt();
		int temp=n;
		int m=0;

		while (n>0)
		{
			int d=n%10;
			m=(m*10)+d;
			n/=10;
		}
		if (m==temp)
		{
			System.out.println("Pallendrom");
		}else
			System.out.println("Not Pallendrom");
	}
}
