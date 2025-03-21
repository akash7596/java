import java.util.Scanner;
class AddDigit 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number");//63241,//789456,//0321
		int n=scn.nextInt();
		int sum = 0;
		while (n>0)
		{
			sum+=n%10;
			n/=10;
		}
		System.out.println(n);// n=0
			System.out.println(sum);//sum=16 //39 //6

			if (n==0 && sum>9)
			{
				System.out.println(sum);//16//39
				n=sum;
				System.out.println(n);//16 //39
				sum=0;
			}
			System.out.println(sum);//0 //0//6
	}
}
