import java.util.Scanner;
class EvenOrOdd 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");

		int a=scn.nextInt();
		if((a&1)==0)// by using & 
		{
			System.out.println("It is a Even Number ");
		}
			else
				{
					System.out.println("it is odd number");
				}
	}
}
