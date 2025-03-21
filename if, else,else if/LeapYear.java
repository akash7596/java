import java.util.Scanner;
class LeapYear 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the year");

		int year=scn.nextInt();

		if(year<=0)
			System.out.println("Invalid Year");

		else if(year%400==0 || (year%4==0 && year%100!=0))
			System.out.println("Leap year");

		else
			System.out.println("Not a Leap Year");
	}
}
