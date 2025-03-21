import java.util.Scanner;

class Fibonachi 
{
	public static void main(String[] args) 
	{
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter the range:");
		int range=scn.nextInt();
		int a=-1;
		int b=1;
		int c;

		for (int i=0;i<range ;i++ )
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}
