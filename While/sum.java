//Sum of Digits 6+3+2+4+1
class SumDigits 
{
	public static void main(String[] args) 
	{
		int n=63241;
		int sum=0;
		while(n>0)
			{
				sum+=n%10;//n%10 extracts the last digit
				n/=10;// remove the last digits.
			}
				System.out.println(sum);

	}
}
