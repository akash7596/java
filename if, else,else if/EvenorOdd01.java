import java.util.Scanner;
class Eo
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter The Number");
		int a=scn.nextInt();
		if(a%2==0)
			{
			System.out.println("It is a even number");
		}else
			{
			System.out.println("It is an odd number");
		}
	}
}
