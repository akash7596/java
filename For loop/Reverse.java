//WAP to print natura number in reverse order;
//write a program to print n to 1 natural number;

import java.util.Scanner;
class Reverse
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number (n):");
		int n=scn.nextInt();

		System.out.println("Natural number from" +n+ "to 1:");

			for (int i=n;i>=1 ;i-- )
			{
			System.out.println(i+"");
			}
			
	}
}

