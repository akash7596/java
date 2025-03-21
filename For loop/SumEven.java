import java.util.Scanner;
class SumEven 
{
	public static void main(String[] args) 		
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number:");

		 int a=scn.nextInt();
		 int b=scn.nextInt();

		 int sum=0;

		 System.out.println("Enter the range of Even number from "+a+ "to"+b+":");

		 for (int i=a;i<=b ;i++ )
		 {
			 if (i%2==0)
			 { 
				 System.out.println(i);
				sum+=i;
			 }
		 }
		 System.out.println("Sum of Even Numbe is:"+sum);
	}
}
